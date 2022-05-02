package com.bridgelabz;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is prime or not: ");
        int num = Utility.getUserInteger();
        if (isPrime(num))
            System.out.println(num+" is a prime number.");
        else
            System.out.println(num+" is not a prime number.");
    }
}
