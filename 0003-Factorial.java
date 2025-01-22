// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to calculate the factorial of a given number using a loop.

import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Factorial Program");
        System.out.print("Enter your number :- ");
        int num = in.nextInt();
        int result = 1;
        
        // check number is positive or not 
        if(num < 1){
            System.out.println("Enter Positive Number.");
        }else{
            for(int i = num; i >=1 ; i--){
            result *= i;
        }
        System.out.println("The Result of "+num+" Factorial is "+result);
        }
        in.close();
    }
}
