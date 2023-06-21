import java.util.*;

public class BubleSort {

  public void bubbleSort(long arr[]) {
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length -1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          long temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    long arr[] = new long[100000];
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(1000);
      System.out.print(arr[i]+" ");
    }
    BubleSort bs = new BubleSort();
    long start = System.nanoTime();
    bs.bubbleSort(arr);
    long end = System.nanoTime();

    long duriation= end - start;

    double elapsedTime = (double)duriation/1_000_000_000;

    System.out.println("\nThe Sorted array is : ");
    System.out.println(Arrays.toString(arr));
    System.out.println("The time taken to sort "+arr.length+" elements is: "+elapsedTime+ " seconds");
  }
}
