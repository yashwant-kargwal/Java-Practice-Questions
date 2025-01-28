// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Find MAX Number in array

public class Main {
    public static void main(String[]args){

        // declare
        int numbers[] = {45,54,46,13,46,15,63,46,44,63,54,68};

        // Integer.MIN_VALUE used to store min number of Int.
        int max = Integer.MIN_VALUE;

        for(int num: numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
