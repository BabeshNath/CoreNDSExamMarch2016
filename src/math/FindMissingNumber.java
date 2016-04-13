package math;

/**
 * Created by mrahman on 4/9/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */
        int n = 10;
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int sumOfNumbers = sumOfNumbers(n);
        int sumOfElements = sumOfElements(array);
        int missingNumber = sumOfNumbers - sumOfElements;
        System.out.println("Missing Number is = " + missingNumber);
    }
    static int sumOfNumbers(int n) {
        int sum = (n * (n+1))/ 2;

        return sum;
    }
    static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

}
