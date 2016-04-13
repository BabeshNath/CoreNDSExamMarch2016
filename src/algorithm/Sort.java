package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        int temp, k;
        for(int c=0; c<array.length; c++){
            temp = array[c];
            for ( k = c-1; k >=0 && temp<array[k]; k--) {
                array[k + 1] = array[k];
            }   //end of Inner for loop

            array[k+1] = temp;
        }    //end of Outer for loop
        for(int j=0; j<array.length; j++){
            // System.out.println(array[j]);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int i, j, temp;

        for(i=0; i<array.length-1; i++) {
            for(j=1; j<array.length-i; j++) {
                if(array[j-1]>array[j]) {
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(j=0; j<array.length; j++) {
            //System.out.println(array[j]);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] mergeSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;

    }
       public static int[] leftHalf ( int[] array){
            int size1 = array.length / 2;
            int[] left = new int[size1];
            for (int i = 0; i < size1; i++) {
                left[i] = array[i];
            }
            return left;
        }

       public static int[] rightHalf ( int[] array){
            int size1 = array.length / 2;
            int size2 = array.length - size1;
            int[] right = new int[size2];
            for (int i = 0; i < size2; i++) {
                right[i] = array[i + size1];
            }
            return right;
        }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }


    public int [] quickSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }



    public int [] heapSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }


    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for (int i=0; i<list.length; i++) {
            list[i]=0;
        }

        for (int i=0; i<array.length; i++) {
            list[array[i]]++;
        }

        int outPos=0;
        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list[i]; j++) {
                array[outPos++]=i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;

                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
