 //remove comma from statment 
package remove_comma;
//invoke build in class
import java.util.Scanner;
 
public class Remove_Comma {
 
    public static void main(String[] args) {
          System.out.println("plase enter any statment :");
        Scanner input = new Scanner(System.in); 
        String str = input.nextLine(); 
        // cnvert all statment to small letters 
        str = str.toLowerCase(); 
        String new_statment = " "; 
        //pass over all string to find comma
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            //delete comma 
            if (ch != ',') {
                new_statment = new_statment + ch;

            }

        }
        //print the string without comma 
        System.out.println(" the ststment without comma: ");
        System.out.println(new_statment);

    }
}
    
    

