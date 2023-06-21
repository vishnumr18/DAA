import java.util.Arrays;
import java.util.Random;

public class QuickSort {


  public void quickSort(long arr[], int low, int high) {
    if (low < high) {
      int pidx = partition(arr, low, high);
      quickSort(arr, low, pidx - 1);
      quickSort(arr, pidx+1, high);
    }
  }

  public static int partition(long arr[], int low, int high) {
    long pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return (i + 1);
  }

  public static void swap(long arr[],int low ,int high){
    long temp = arr[low];
    arr[low ] = arr[high];
    arr[high] = temp;
  }
  public static void main(String[] args) {
    Random rand = new Random();

    long[] arr = new long[100000];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(1000);
      System.out.print(arr[i]+" ");
    }

    QuickSort qs = new QuickSort();

    long start = System.nanoTime();
    qs.quickSort(arr, 0, arr.length - 1);
    long end = System.nanoTime();
    long total = end - start;

    double elapsedTime = (double) total / 1_000_000_000;

    System.out.println("\nSorted array is: ");
    System.out.println(Arrays.toString(arr));
    System.out.println("Time taken to sort "+arr.length+" is "+ elapsedTime +" seconds");

    
  }
}