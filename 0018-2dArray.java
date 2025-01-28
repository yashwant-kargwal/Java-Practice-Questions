// Yashwant Kargwal
// Don't Forget to ⭐Star and Fork.
// Make 2D Array in array

public class Main {
    public static void main(String[]args){

        // 1st way to make 2d array 
        int array1[][];
        array1 = new int[0][3];
        
        array1[0][0] = 12;
        array1[0][1] = 24;
        
        System.out.println(array1[0][0]);
        
        // 2nd way to make 2d array
        int array[][] = new int[0][2];
        
        array1[0][0] = 12;
        array1[0][1] = 24;
        array1[0][2] = 35;
        
        System.out.println(array1[0][0]);
        
        
        // third to make 2d array
        int array3[][] = {
                {12,24,35},
                {24,25,26},
                {35,36,34}
        };

        System.out.print(array3[0][2]);

    }
}
