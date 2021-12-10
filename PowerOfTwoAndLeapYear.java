package com.mycompany.functionalprogramsdec09;
import java.io.*;
public class PowerOfTwoAndLeapYear {
    public void printpowers(int N){
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(in);
        System.out.println("The powers of 2 are");
        for (int i=0;(i<=N && i<32);i++){
            System.out.println(i + " " +Math.pow(2,i));
            if (Math.pow(2,i)%4==0){
                System.out.println("The year is a leap year");
            }
            else{
                System.out.println("The year is not a leap year");
            }
        }

    }
    public static void main(String []args){
        PowerOfTwoAndLeapYear ptl = new PowerOfTwoAndLeapYear();
        ptl.printpowers(40);
    }
}
