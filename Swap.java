
import java.util.Scanner;


public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the two number");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Before swapping: a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+" b="+b);
    }
}
