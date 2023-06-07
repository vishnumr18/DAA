class MOverloding{
    int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    float add(float a,float b){
        float sum=a+b;
        return sum;
    }
}
public class Overloding {
    public static void main(String[] args) {
        MOverloding obj = new MOverloding();
        int s1=obj.add(10, 20);
        int s2=obj.add(10 , 20, 30);
        float s3=obj.add(2.2f, 2.8f);
        
        System.out.println("Result sum1: "+s1);
        System.out.println("Result sum2: "+s2);
        System.out.println("Result sum3: "+s3);
    }
    
}
