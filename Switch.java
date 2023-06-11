import java.util.*;
public class Switch {
    public static void main(String[] args) {
        double a,b,c;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter operater(+,-,*,/)");
        char ch= in.next().charAt(0);
        System.out.println("Enter valuse of a and b");
        a=in.nextDouble();
        b=in.nextDouble();
        switch(ch){
            case '+':c=a+b;
                System.out.println("Result: "+a+"+"+b+"="+c);
            break;
            case '-':c=a-b;
                System.out.println("Result: "+a+"-"+b+"="+c);
            break;
            case '*':c=a*b;
                System.out.println("Result: "+a+"*"+b+"="+c);
            break;
            case '/':c=a/b;
                System.out.println("Result: "+a+"/"+b+"="+c);
            break;
        }
    }
}
