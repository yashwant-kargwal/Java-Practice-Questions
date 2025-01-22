// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to print the multiplication table of a given number.

import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Program To Print Table");
        System.out.print("Enter Your Number :- ");
        int num = in.nextInt();
        
        // for loop to print table form 1 to 10
        for(int i = 1; i <= 10; i++){
            System.out.println(num+"*"+i+"="+i*num);
        }
        
        in.close();
    }
}
