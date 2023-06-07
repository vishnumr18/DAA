import java.util.*;

public class SimpleInt {
    public static void main(String[] args) {
        float p,r,t,si;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principle amt, rate, time");
        p=in.nextFloat();
        r=in.nextFloat();
        t=in.nextFloat();
        si=(p*r*t)/100;
        System.out.println("Simple interst="+si);
    }
}
