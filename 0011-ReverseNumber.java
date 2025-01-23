// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to reverse the digits of a given number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to reverse the digits");
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        int revNum = 0;
        
        // check if number is negative
        if(num < 0){
            System.out.println("Please Enter Positive numbers....");
        }
        else{
            
            // while loop to make reverse number
            // we use while loop because we don't know the total digits in User Input
            while(num != 0){
                revNum = (revNum*10) + num%10;  // Extract and add last digit in revNum
                num /= 10;  // Remove last digit form num
            }
            
        }
        System.out.println("Reverse Number : "+revNum);
        sc.close();
    }
}
