import java.util.*;

public class InsertionSort {
  public static void printArr(long arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void insertionSort(long arr[]) {
    for (int i = 1; i < arr.length; i++) {
      long curr = arr[i];
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
    long arr[] = new long[100000];
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(1000);
      System.out.print(arr[i]+" ");
    }
    long start = System.nanoTime();
    insertionSort(arr);
    long end = System.nanoTime();

    long duriation= end - start;

    double elapsedTime = (double)duriation/1_000_000_000;

    System.out.println("\nThe Sorted array is : ");
    System.out.println(Arrays.toString(arr));
    System.out.println("The time taken to sort " + arr.length + " elements is: " + elapsedTime+" seconds");
  }
}

