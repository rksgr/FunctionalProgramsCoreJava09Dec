package com.mycompany.functionalprogramsdec09;
import java.util.Scanner;
import java.io.*;

public class FlipCoin {
    public void flipCoin(){
        System.out.println("Please enter the number of times the coin needs to be flipped.");
        //variables
        int no_of_heads=0;
        int no_of_tails=0;
        Scanner sc = new Scanner(System.in);
        int flipcoin_times = sc.nextInt();
        while (flipcoin_times<0){   
            sc = new Scanner(System.in);
            flipcoin_times = sc.nextInt();
        }
        System.out.println("The number of times to flip coin = " + flipcoin_times); 
        for (int i=0;i<=flipcoin_times;i++){
            double value = Math.floor(Math.random()*10);
            System.out.println(value);
            if (value >=5){
                System.out.println("It is a head");
                no_of_heads++;
            }else if(value<5){
                System.out.println("It is a tail");
                no_of_tails++;
            }
        }
        System.out.println("heads = "+ no_of_heads+ "tails = "+ no_of_tails);
        System.out.println("Percentage of times Head is there = "+ no_of_heads*100/(no_of_heads +no_of_tails));
        System.out.println("Percentage of times Tail comes = "+ no_of_tails*100/(no_of_heads +no_of_tails));
    }
    public static void main(String []args){
        FlipCoin fc = new FlipCoin();
        fc.flipCoin();
    }
}
