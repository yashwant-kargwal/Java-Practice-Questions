// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Find Min Number in array

public class Main {
    public static void main(String[]args){

        // declare
        int numbers[] = {45,54,46,13,46,15,63,46,44,63,54,68};

        // Integer.MAX_VALUE used to store max number of Int.
        int min = Integer.MAX_VALUE;
        
        for(int num: numbers){
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
