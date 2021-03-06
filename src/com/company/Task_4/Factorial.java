package com.company.Task_4;
import java.math.BigInteger;

/*
TASK NR 4 - DESCRIPTION:
Write a program that computes the factorial N! = 1x2x…… xN using BigInteger. Compute the factorial of 1000.
*/

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorialBigInteger(200));

    }


    public static BigInteger factorialBigInteger (int num) {

        BigInteger fact = BigInteger.valueOf(1);
        for(int i=2; i<=num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;

    }


}
