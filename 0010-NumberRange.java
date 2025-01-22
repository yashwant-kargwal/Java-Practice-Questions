// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to check if a number is in the range between 10 and 50.


import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Program to check the range between 10 to 50.");
        System.out.println("Enter Your Number :- ");
        int num = in.nextInt();
        
        // check if number between the range or not
        if(num >= 10 && num <= 50){
            System.out.println("Your Entered Number is in the range of 10 to 50.");
        }
        else{
            System.out.println("Your Entered Number is not in the range of 10 to 50.");
        }
        
        in.close();
    }
}
