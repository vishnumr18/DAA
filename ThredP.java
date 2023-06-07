import java.util.*;

class Square extends Thread{
    int x;

    Square(int n) {
        x=n;
    }
    public void run(){
        int sqr=x*x;
        System.out.println("Square of "+x+"="+sqr);
    } 
}

class Cube extends Thread{
    int x;

    Cube(int n) {
        x=n;
    }
    public void run(){
        int cub=x*x*x;
        System.out.println("Cube of "+x+"="+cub);
    }
}

class Rnumber extends Thread{
    public void run(){
        Random random= new Random();
        for(int i=0;i<5;i++){
            int randInt = random.nextInt(10);
            System.out.println("Random No= "+randInt);
            Square s = new Square(randInt);
            s.start();
            Cube c = new Cube(randInt);
            c.start();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class ThredP {
    public static void main(String[] args) {
        Rnumber n = new Rnumber();
        n.start();
    }
}
