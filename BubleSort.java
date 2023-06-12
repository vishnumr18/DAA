import java.util.*;

public class BubleSort {
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length-1; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length -1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    printArr(arr);
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of elements: ");
    int n = in.nextInt();

    int arr[] = new int[n];
    System.out.format("Enter the %d elements: ",n);
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    bubbleSort(arr);
  }
}
