
package com.mycompany.functionalprogramsdec09;

import java.util.Scanner;

public class QuotientAndRemainder {
    public void quotientAndRemainder(){
        System.out.println("Enter the dividend: ");
        Scanner sc = new Scanner(System.in);
        int divid = sc.nextInt();
        System.out.println("Enter the divisor: ");
        Scanner sc1 = new Scanner(System.in);
        int divis = sc1.nextInt();
        int quot = divid/divis;
        int rmd = divid%divis;
        System.out.println(divid+" divided by "+divis+" yields a quotient of "+quot+""
                + " and remainder of "+rmd);
    }
    public static void main(String []args){
        QuotientAndRemainder qar = new QuotientAndRemainder();
        qar.quotientAndRemainder();
    }
}
