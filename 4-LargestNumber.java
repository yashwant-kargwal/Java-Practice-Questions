// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to find the largest of three numbers using conditional statements.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Largest Number in Three Number");

        System.out.println("Enter Your First Number :- ");
        int first = in.nextInt();

        System.out.println("Enter Your Second Number :- ");
        int second = in.nextInt();

        System.out.println("Enter Your Third Number :- ");
        int third = in.nextInt();
        
        
//        1 way if else statements

        int result = 0;
        if(first>second){
            if(first>third){
                result = first;
            }
            else{
                result = third;
            }
        }else{
            if (second > third) {
                result = second;
            } else {
                result = third;
            }
        }
        System.out.println("Your Largest Number is "+result);
        
//        2 way by ternary Operator

        int res = first>second ? first>third? first : third : second>third?  second :  third;
        System.out.println("Your Largest Number is "+res);
        
        in.close();
    }
}
