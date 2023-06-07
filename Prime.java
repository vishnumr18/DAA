import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the Number");
        int n=in.nextInt();
        if(n==0){
            System.out.println("The number is neither prime Nor Composit");
            System.exit(0);
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }  
        if(flag==1){
            System.out.println("The number is not Prime");
        }
        else{
            System.out.println("The number is prime");
        }
    }
}
