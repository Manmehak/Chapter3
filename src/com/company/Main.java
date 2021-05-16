package com.company;

import java.security.SecureRandom;

public class Main {

    //Finding maximum
//    public static void max(double num1, double num2, double num3){
//        double maximum = num1;
//        if(num2>num1){
//            maximum = num2;
//        }
//        if(num3>num1 && num3>num2){
//            maximum = num3;
//        }
//        System.out.print("Maximum is : "+ maximum);
//    }
    public static void main(String[] args) {

        //Finding max number
//        max(3,5,7);

        //Type Casting
//        long myLong = 1000000L;
//        int myInt;
//        myInt= (int)myLong;
//        System.out.println(myInt);    //Here long is converted into int

//      Getting secure Random number
//        SecureRandom randomNumber = new SecureRandom();
//        getting 2 random
//        int die1 = 1 + randomNumber.nextInt(6);
//        int die2 = 1 + randomNumber.nextInt(6);
//
//        int dice = die1 + die2;
//        System.out.println(dice);
        System.out.println(rollDice(3,6));
    }
    public static int rollDice(int numDice, int numSides){
        SecureRandom randomNumber = new SecureRandom();
        int result = 0;
        //Creating for loop for automatically rolling dice
        for(int i=0;i<=numDice-1;i++){
            result = result+ 1 + randomNumber.nextInt(numSides);
        }
        return result;
    }
}
