 //find the maximum value in array element 
package task3;

//invoke build in class 
 import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Scanner read = new Scanner(System.in); 
        System.out.println("enter the size of array"); 
        int size = input.nextInt(); 
        int[] array = new int[size]; 
        System.out.println("enter the element");
        //user enter array element 
        for (int i = 0; i < array.length; i++) {
            System.out.print("element " + (i + 1) + ": ");
            array[i] = read.nextInt();
        }
         // print array element 
        System.out.print(" the array is :" + "(");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
            }
     System.out.println(" )");
    // finf the largest value in array
         int largest = array[0];
        for (int num : array) {
            if (largest < num) {
                largest = num;
            }
        }
       System.out.println("Largest element = "+ largest);

    }
    }
    
 
