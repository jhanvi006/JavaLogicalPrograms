package com.bridgelabz;

public class PerfectNumber {
    public static boolean isPerfectNumber(int n){
        if (n == 1)
            return false;
        /* sum will store the sum of proper divisors */
        int sum = 1;
        /* check if they are divisors or not */
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n)
                    sum += i;
                else
                    sum += i + (n / i);
            }
        }
        if (sum == n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check if its perfect or not: ");
        int num = Utility.getUserInteger();
        if (isPerfectNumber(num))
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfect number");
    }
}
