import java.util.*;

public class LinearScr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of elelements: ");
    int n = in.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements: ");

    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    
    System.out.println("Enter the key to search: ");
    int key = in.nextInt();

    int i,found=0;
    for ( i = 0; i <= arr.length; i++) {
      if (arr[i] == key) {
        found = 1;
        break;
      }
      else {
        break;
      }
    }

    if (found == 1) {
      System.out.format("The elment is found in %d position.", i + 1);
    } 
    else {
      System.out.println("The element is not found!!!");
    }
  }
}
