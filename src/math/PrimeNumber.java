package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
		 */

		int i=0;
		int num=0;
		String  primeNumbers = "";

		for (i = 2; i < 1000000; i++) {
			int counter =0;
			//prime = false;
			for (num = i; num>=1; num--) {
				if (i%num==0) {
					counter = counter + 1;
				}
			}
			if (counter ==2) {
				primeNumbers = primeNumbers + i + " ";
				System.out.println("Prime numbers from 1 to 1000000 are :" + primeNumbers);
			}
		}

	}
}
