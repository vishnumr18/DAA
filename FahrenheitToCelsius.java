
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double f,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperatur in Fahrenheit");
        f=in.nextDouble();
        
        c=(f-32)*5/9;
        
        System.out.println("Temprature in Celsius= "+c);
    }
}
