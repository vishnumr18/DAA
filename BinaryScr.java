import java.util.*;

public class BinaryScr {
  public static int  binaryScr(int arr[], int key) {
    int low = 0;
    int high = arr.length - 1;
    
    while (low <= high) {
      int middle = (low + high) / 2;
      int currentVal = arr[middle];

      if (currentVal == key) {
        return middle + 1;
      }  if (currentVal < middle) {
        high = middle - 1;
      } else {
        high = middle + 1;
      }
    }
    // System.out.println("The element is not found!!!!");
    return -1;
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

    System.out.println("Enter the key to be searched: ");
    int key = in.nextInt();

    
    // int print = binaryScr(arr, key);
    System.out.println(binaryScr(arr, key));
    
  }
}
