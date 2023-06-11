import java.util.*;

public class InsertionSort {
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int j = i - 1;
      while (j >= 0 && curr < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = curr;
    }
    printArr(arr);
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of elements: ");
    int n = in.nextInt();


    int arr[] = new int[n];
    System.out.format("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

  insertionSort(arr);
  }
}
