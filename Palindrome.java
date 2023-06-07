
import java.util.Scanner;



public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter the string to check if palendrome");
        s=in.next();
        int i=0;
        int j= s.length()-1;
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Not a palendrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("The string is Palendrome");
    }
}
