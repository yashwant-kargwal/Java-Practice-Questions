// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to calculate the sum of all numbers from 1 to N.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the sum of all numbers from 1 to N");
        System.out.print("Enter Your Number :- ");
        int N = sc.nextInt();
        int Sum = 0;    
        
        // Check Number is Positive or not
        if(N<1){
            System.out.println("Enter Positive Number.");
        }else{
            // For loop
            for(int i = 1; i<=N; i++){
                Sum += i;
            }
            System.out.println("The Sum of 0 to "+N+" is "+Sum);
        }
        sc.close();
    }
}
