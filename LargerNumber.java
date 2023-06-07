
import java.util.Scanner;



public class LargerNumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers a,b,c");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        
       if(a>b && a>c){
           System.out.println(+a+" is greatest");
       }
       if(b>a && b>c){
           System.out.println(+b+" is greatest");
       }
       if(c>a && c>b){
           System.out.println(+c+" is greatest");
       }
    }
}
