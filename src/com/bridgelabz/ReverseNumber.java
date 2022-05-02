package com.bridgelabz;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse: ");
        int num = Utility.getUserInteger();
        int revNum = 0;
        int remainder;
        System.out.print("Reverse of "+num+" is ");
        while(num>0){
            remainder = num%10;
            revNum = (revNum*10) + remainder;
            num = num/10;
        }
        System.out.println(revNum);
    }
}
