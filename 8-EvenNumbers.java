// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to print all even numbers between 1 to N.

import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Program To Print Even Numbers form you Entered Value");
        System.out.print("Enter Your Number :- ");
        int num = in.nextInt();
        
        // Check if number is less than 0
        if(num < 0){
            System.out.println("Please Enter Positive Number.");
        }
        else{
            System.out.println("The Even Numbers are :- ");
            
            // for loop to print even number using %2==0
            for(int i = 0; i <= num ; i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
    
        in.close();
    }
}
