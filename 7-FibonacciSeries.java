// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to print the Fibonacci series up to the Nth term.

import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Program To Print Fibonacci Series");
        System.out.print("Enter Your Nth Term :- ");
        int n = in.nextInt();
        int first = 0, second = 1;
        
        // Check number is either smaller or equal to 0
        if(n <= 0){
            System.out.println("Enter Positve Or Greater Than 0 Number");
        }
        // Check number is equal to 1
        else if(n == 1){
            System.out.println("The Fibonacci Series of "+n+"th term is :-  "+first);
        }else{
            System.out.print("The Fibonacci Series of "+n+"th term is :- "+first+","+second);
            int next = 0;
            
            // for loop to print next value of series 
            for(int i = 3; i <= n; i++){
                next = first + second;
                System.out.print(","+next);
                first = second;
                second = next;
            }
        }
    
        in.close();
    }
}
