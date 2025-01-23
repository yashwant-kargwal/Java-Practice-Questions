// Creator - Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Problem: Create an inverted right-angled triangle pattern with *.

// Output of Pattern :- 
// *****
// ****
// ***
// **
// *

class Main{
    public static void main(String[]args){
        
        // this loop is used to print the line of pattern
        for(int i = 5; i >=1; i--){
            // this loop is used to print the *
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // this is used for next line
            System.out.println();
        }
        
    }
}
