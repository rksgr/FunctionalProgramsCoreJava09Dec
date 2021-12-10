package com.mycompany.functionalprogramsdec09;
import java.util.Scanner;

public class PrimeFactors {
    public void primeFactors(){
        System.out.println("Enter the number whose prime factors are to be found out:");
        // Input from user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int no_of_prime_factors = 0;
        System.out.println("The prime factors of "+num+" are: ");
        // computation
        for (int i=2;i<=num/2+1;i++){
            // compute whether number is a factor
            if (num%i==0){
                // compute whether factor is a prime factor
                boolean if_factor_is_prime = true;
                for (int j=2;j<=i/2+1;j++){
                    if (i%j==0){
                        if_factor_is_prime = false;
                    }
                }
                if (if_factor_is_prime==true){
                        no_of_prime_factors++;
                        System.out.println(i);
                    }
                }
            }
        if (no_of_prime_factors==0){
            System.out.println("Sorry the number has no prime factors!");
        }
    }
    public static void main(String []args){
        PrimeFactors pf = new PrimeFactors();
        pf.primeFactors();
    }
}
