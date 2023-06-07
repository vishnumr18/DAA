import java.util.*;
public class Substring {
    public static void main(String[] args) {
        String s;
        int i,j;
        System.out.println("Enter the string");
        Scanner in = new Scanner(System.in);
        s=in.next();
        System.out.println("Substring of "+s+" are:");
        for( i=0;i<=s.length();i++){
            for( j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
