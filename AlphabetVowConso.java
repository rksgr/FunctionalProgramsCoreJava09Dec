
package com.mycompany.functionalprogramsdec09;
import java.util.Scanner;

public class AlphabetVowConso {
    public void alphabetVowConso(){
        System.out.println("Enter a single character ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while (str.length()!=1){
            System.out.println("Please enter a single character ");
            Scanner sc1 = new Scanner(System.in);
            str = sc1.next(); 
        }
        String vow1="a", vow2 = "e", vow3 = "i", vow4 = "o", vow5 = "u";
        if ((str.equals(vow1))||(str.equals(vow2))||(str.equals(vow3))||(str.equals(vow4))||(str.equals(vow5))){
            System.out.println(str+" is a vowel.");
        }else{
            System.out.println(str+" is a consonant.");
        }
    }
    public static void main(String []args){
        AlphabetVowConso avc = new AlphabetVowConso();
        avc.alphabetVowConso();
    }
}
