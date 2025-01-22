// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Write a program to check if a number is prime or not.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Check Number is Prime or Not?");
        System.out.print("Enter Your Number :- ");
        int number = in.nextInt();

        if(number <= 1){
            System.out.println("Negative Number and 1 are not Prime");
        }
        else{
            for(int i = 2; i < number;i++){
                if(number%i == 0){
                    System.out.println("Number is Not Prime");
                    break;
                }
                else {
                    System.out.println("Number is Prime");
                    break;
                }
            }
        }

        in.close();
    }
}
