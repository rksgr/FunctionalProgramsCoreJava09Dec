
package com.mycompany.functionalprogramsdec09;
import java.util.Scanner;

public class LargestOfThreeNums {
    public void largestOfThreeNums(int num1, int num2, int num3){
        if ((num1>num2)&&(num1>num3)){
            System.out.println(num1+ " is the largest number among the three numbers.");
        } else if(num2>num3){
            System.out.println(num2 +" is the largest among the three numbers.");
        }else{
            System.out.println(num3+" is the largest among the three numbers");
        }
    }
    public static void main(String []args){
        LargestOfThreeNums lotn = new LargestOfThreeNums();
        //lotn.largestOfThreeNums(12, 21, 8);
        lotn.largestOfThreeNums(21, 21, 8);
    }
}
