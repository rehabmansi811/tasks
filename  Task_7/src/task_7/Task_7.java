 //Quicksort function to arrange element of array
package task_7;
public class Task_7 {
public static void quick_sort(int [] array, int left, int right) {
 if (left < right) {
     //calling position method and save its return value in variable
 int q = position(array, left, right);
 quick_sort(array, left, q-1);
 quick_sort(array, q+1, right);
 }
 }
 private static int position(int array [], int left, int right) {
 int i = left - 1;
 for (int j = left ; j < right ; j++) {
 if (array[j] < array[right]) {
 i++;
 swap(array, i, j);
 }
 }

 swap(array, i+1, right);
 return i+1;
 }
 // swap function to swap elements
 private static void swap(int [] array, int i, int j) {
 int temp = array[i];
 array[i] = array[j];
 array[j] = temp;
 }
    public static void main(String[] args) {
      System.out.println("Hello! World!!");
      int [] array= {3, 1, 5, 4, 2};
      //calling quick sort functon and passing its parameter
      quick_sort(array, 0, array.length - 1);
      //print array after sort it
      for (int i = 0 ; i < array.length ; i++) {
      System.out.println(array[i]);
 }
    }
    
}
