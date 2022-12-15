 //get compination and permutation 
package task2;
// invoke bulid in class
 import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
       
        int nCr, nPr;
        System.out.println("please enter two number :");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = 1;
        // factorial(n)
        for (int i = 1; i <= x; i++) {
            z = z * i;
        }
        int w = 1;
        //factorial(n-r)
        for (int i = 1; i <= (x - y); i++) {
            w = w * i;
        }
        int c = 1;
        //factorial(r)
        for (int i = 1; i <= (y); i++) {
            c = c * i;
        }
        //ncr = factorial (n)/factorial(n-r)*factorial(r)
        nCr = z / (w * c);
        //npr = factorial (n)/factorial(n-r)
        nPr = z / w;
        System.out.println("(nCr)Combination iS : " + nCr);
        System.out.println("(nPr)Permutation iS : " + nPr);
        
    }

}        
    
 
