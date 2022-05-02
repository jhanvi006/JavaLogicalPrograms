package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class Utility {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();
    public static int getUserInteger(){
        return sc.nextInt();
    }
    public static double getUserDouble(){
        return sc.nextDouble();
    }
    public static char getUserCharacter(){  return sc.nextLine().charAt(0); }
    public static double getRandomDouble(int i){
        double randomDouble = random.nextDouble(i);
        return randomDouble;
    }
}
