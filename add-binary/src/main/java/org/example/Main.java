package org.example;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String sum = addBinary(a, b);
        System.out.println("Binary Sum: " + sum);
    }

    public static String addBinary(String a, String b){
        BigInteger number1 = new BigInteger(a, 2);
        BigInteger number2 = new BigInteger(b,2);
        BigInteger sum = number1.add(number2);

        return sum.toString(2);
    }
}