
package com.mycompany.functionalprogramsdec09;
import java.util.Scanner;

public class SwapTwoNumbers {
    public void swapTwoNumbers(){
        System.out.println("Enter number1: ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println("Enter number2: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped numbers are: "+ num1+ " and "+ num2);
    }
    public static void main(String []args){
        SwapTwoNumbers stn = new SwapTwoNumbers();
        stn.swapTwoNumbers();
    }
}
