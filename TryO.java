import java.util.*;

public class TryO {
    int c;
    public void div(int a,int b){
        try{
            c=a/b;
            System.out.println("Result="+c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide the number by zero");
        }
    }
    public static void main(String[] args) {
        TryO obj = new TryO();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int x=in.nextInt();
        int y=in.nextInt();
        
        obj.div(x,y);
    }
}
