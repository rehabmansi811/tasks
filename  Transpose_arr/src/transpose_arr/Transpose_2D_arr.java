 //get transpose of 2_d matrix
package transpose_arr;
//invoke build in class
 import java.util.Scanner;

public class Transpose_2D_arr {
 
    public static void main(String[] args) {
        Scanner read_1 = new Scanner(System.in); 
        Scanner read_2 = new Scanner(System.in); 
        Scanner read_3 = new Scanner(System.in);
        // enter matrix size 
        System.out.println("enter number of rows"); 
        int r = read_1.nextInt(); 
        System.out.println("enter number of coulms"); 
       // enter matrix element
        int c = read_2.nextInt(); 
        int[][] _2dArray = new int[r][c]; 
        for (int i = 0; i < r; i++) {
            System.out.println("enter the element in ROW " + (i + 1) + " : ");
            for (int k = 0; k < c; k++) {
                _2dArray[i][k] = read_3.nextInt();
            }
        }

       //print matrix elements
        System.out.println("THE 2D_ARRAY IS : {");
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < c; k++) {
                System.out.print(_2dArray[i][k] + "  ");}
             System.out.println(" ");
             
        }
        System.out.println("}");
        // transpose the matrix
        System.out.println("THE TRANSPOSE 2D_ARRAY IS :");
        System.out.println("{");
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < c; k++) {
                System.out.print(_2dArray[k][i] + "  ");}
             System.out.println(" ");
        }
        System.out.println("}");
    }

}  
    
    

