import java.util.*;


public class GCDcalculater {
  public static int calculater(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the two numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();

    int gcd = calculater(a, b);

    System.out.println("The gcd of "+a+" and "+b+" is "+gcd);
  }
}
