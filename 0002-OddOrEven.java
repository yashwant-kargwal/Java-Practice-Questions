// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program that takes an integer input and checks whether it's odd or even.

import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Checks number is Odd or Even");
        System.out.print("Enter your number :- ");
        int num = in.nextInt();
        
        // check number is odd or even
        if(num%2==0){
            System.out.println("Your Number "+num+" is Even");
        }else{
            System.out.println("Your Number "+num+" is Odd");
        }
        in.close();
    }
}
