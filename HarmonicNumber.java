
package com.mycompany.functionalprogramsdec09;
import java.util.Scanner;

public class HarmonicNumber {
    public void harmonicNumber(){
        System.out.println("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num<=0){
            System.out.println("Please enter an integer greater than 0: ");
            sc = new Scanner(System.in);
            num = sc.nextInt();     
        }
        double harm_num=0.0;
        for (double i=1;i<=num;i++){
            harm_num = harm_num + 1/i;
        }
        System.out.println(" The "+num+"th harmonic number = " + harm_num);
    }
    public static void main(String []args){
        HarmonicNumber hn = new HarmonicNumber();
        hn.harmonicNumber();
    }   
}
