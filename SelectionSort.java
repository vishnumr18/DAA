import java.util.*;

public class SelectionSort {
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = in.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    
    for (int i = 0; i < arr.length; i++) {
      int smallest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[smallest] > arr[j]) {
          smallest = j;
        }
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;
    }
    printArr(arr);
    System.out.println();
  }
}
