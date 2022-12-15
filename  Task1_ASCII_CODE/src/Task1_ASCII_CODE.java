 // get the character from ascii code 
//invoke build in class
 import java.util.Scanner;
public class Task1_ASCII_CODE {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
         System.out.println(" please eter ascii code");
         
         //user will input numbers which needed to be converted to chatacter  
        char conv = (char) input.nextInt();
        System.out.println("the ascii code is : "+conv);
    }
    
}
