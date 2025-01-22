// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program that checks if a number is divisible by both 3 and 5.


import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Program to number is divisible by both 3 and 5.");
        System.out.println("Enter Your Number :- ");
        int num = in.nextInt();
        
        // Check number is divisible by both or not
        if(num%3==0 && num%5==0){
            System.out.println(num+" is divisible by both 3 and 5.");
        }
        else{
            System.out.println(num+" is not divisible by both 3 and 5.");
        }
        in.close();
    }
}
