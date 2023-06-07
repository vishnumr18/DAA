import java.util.*;


public class BubbleSort {

  public static void display(int arr[]) {
    System.out.println("The sorted elements are: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = in.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i]=in.nextInt();
    }
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    display(arr);
  }
}
