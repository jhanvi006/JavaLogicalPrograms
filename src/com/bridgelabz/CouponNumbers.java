package com.bridgelabz;

public class CouponNumbers {
    public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }
     /* return number of cards you collect before obtaining one of each of the n types */
    public static int collect(int n) {
        /* isCollected[i] = true if card type i already collected */
        boolean[] isCollected = new boolean[n];
        /* number of cards collected */
        int count = 0;
        /* number of distinct card types collected */
        int distinct  = 0;
        while (distinct < n) {
            int value = getCoupon(n);
            count++;
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to collect that many coupons: ");
        int n = Utility.getUserInteger();
        int count = collect(n);
        System.out.println("There are "+count+" random numbers required to get "+n+" distinct coupons.");;
    }
}
