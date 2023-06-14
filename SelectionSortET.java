import java.util.*;

public class SelectionSortET {

  public void selecSort(long arr[]) {
    long lenn = arr.length;
    for (int i = 0; i < lenn - 2; i++) {
      int min = i;
      for (int j = i + 1; j < lenn; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      long temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }
  public static void main(String[] args) {

    long arr[]= new long[6000];
    Random rand = new Random();

    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(1000);
      System.out.print(arr[i] + " ");
    }
    
    SelectionSortET ss = new SelectionSortET();
    long start = System.nanoTime();
    ss.selecSort(arr);
    long end = System.nanoTime();
    long total = end - start;

    double elapsedTime = (double) total / 1_000_000_000;

    System.out.println("\nSorted array is: ");
    System.out.println(Arrays.toString(arr));
    System.out.println("Time taken to sort "+arr.length+" is "+ elapsedTime +" seconds");
  }
}
