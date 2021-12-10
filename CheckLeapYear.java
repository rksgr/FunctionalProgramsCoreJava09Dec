
package com.mycompany.functionalprogramsdec09;
import java.util.Scanner;

public class CheckLeapYear {
    public void checkLeapYear(){
        System.out.println("Enter the year to be checked for leap year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%100==0){
            if (year%400==0){
                System.out.println("The year "+year+ " is a leap year.");
            } else if (year%400!=0){
            System.out.println("The year "+year+ " is not a leap year.");
            }
        } else if (year%100!=0){
            if (year%4==0){
                System.out.println("The year "+ year + " is a leap year");
            } else if (year%4!=0){
                System.out.println("The year "+ year + " is not a leap year");
            }
        }
    }
    public static void main(String []args){
        CheckLeapYear cly = new CheckLeapYear();
        cly.checkLeapYear();
    }
}
