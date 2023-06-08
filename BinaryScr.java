import java.util.*;

public class BinaryScr {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = in.nextInt();

    int arr[] = new int[n];
    System.out.format("Enter %d elements: ",n);
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println("Enter the key to be searched: ");
    int key = in.nextInt();

    int res = binScr(arr, key);
    // System.out.println(res);
    if(res != -1){
      System.out.println("The element is found at positon: "+(res+1));
    }else{
      System.out.println("The elenent is not found!!!");
    }
  }
  
  public static int binScr(int arr[], int key) {
    
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] > key) {   
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}