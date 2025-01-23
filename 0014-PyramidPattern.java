// Creator - Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Create a pyramid pattern with *..

// Output of Pattern :- 
//     *
//    ***
//   *****
//  *******
// *********


import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Print Pyramind Pattern");
        System.out.print("Enter Your Rows : ");
        int num = sc.nextInt();
        
        System.out.println();
        
        // this loop is used to print the line of pattern
        for(int i = 1; i <= num; i++){
            
            // this is used to print space
            for(int j = num-1; j >= i;j--){
                System.out.print(" ");
            }
            
            // this is used to print *
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
