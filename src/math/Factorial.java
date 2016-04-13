package math;

import java.util.Iterator;
import java.util.List;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        System.out.println("factorial of 5 by using recursion: " + factorial(5));

        System.out.println("factorial of 8 by using iteration: " + fact(8));
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }


    public static int fact(int number) {
        int result = 1;
        while (number != 0) {
            result = result * number;
            number--;
        }
        return result;


    }

}