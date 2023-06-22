import java.util.*;

public class QuickSortAlpha {
  public void quickSortAlph(char[] arr, int low, int high) {
    if (low < high) {
      int pidx = partition(arr, low, high);

      quickSortAlph(arr, low, pidx - 1);
      quickSortAlph(arr, pidx + 1, high);
    }
  }
  
  public static int partition(char[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return i + 1;
  }

  public static void swap(char[] arr, int low, int high) {
    char temp = arr[low];
    arr[low] = arr[high];
    arr[high] = temp;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of letters: ");
    int n = in.nextInt();

    char[] alph = new char[n];
    System.out.println("Enter " + n + " letters");
    
    for (int i = 0; i < n; i++) {
      alph[i] = in.next().charAt(0);
    }

    System.out.println("Before sorting: ");
    System.out.println(Arrays.toString(alph));

    QuickSortAlpha qsa = new QuickSortAlpha();
    qsa.quickSortAlph(alph, 0, alph.length - 1);
    
    System.out.println("After sorting: ");
    System.out.println(Arrays.toString(alph));
  }
}
