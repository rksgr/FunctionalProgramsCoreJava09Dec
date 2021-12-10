
package com.mycompany.functionalprogramsdec09;
import java.util.Scanner;

public class CheckEvenOdd {
    public void checkEvenOdd(){
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num+" is an even number.");
        }else if (num%2==1){
            System.out.println(num+" is an odd number.");
        }   
    }
    public static void main(String []args){
        CheckEvenOdd ceo = new CheckEvenOdd();
        ceo.checkEvenOdd();        
    }
}
