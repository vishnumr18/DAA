import java.util.*;
public class ArrayL {
    ArrayList<String> list= new ArrayList<>();
    
    public void display(){
        list.add("CSE");
        list.add("ISE");
        list.add("ME");
        System.out.println("Elements of array list are:");
        System.out.println(list);
        System.out.println("");
    }
    
    public void appendAtEnd(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element to be added");
        String ele=in.next();
        list.add(ele);
        System.out.println("Elements of array list are:");
        System.out.println(list);
        System.out.println("");
    }
    
    public void insertAtPos(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element to be added and position");
        int pos=in.nextInt();
        String ele=in.next();
        list.add(pos,ele);
        System.out.println("Elements of the list are:");
        System.out.println(list);
        System.out.println("");
    }
    
    public void search(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        String ele=in.next();
        int n=list.indexOf(ele);
        if(n==-1){
            System.out.println("The element is not found");
        }
        else{
            System.out.println("Element found at"+n);
        }
        System.out.println("");
    }
    
    public void print(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first charecter to search elements");
        char ch=in.next().charAt(0);
        String str=Character.toString(ch);
        System.out.println("The elements starting with char "+str);
        for(int i=0;i<=list.size();i++){
            if(list.get(i).startsWith(str)){
                System.out.println(list.get(i));
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayL obj= new ArrayL();
        obj.display();
        obj.appendAtEnd();
        obj.insertAtPos();
        obj.search();
        obj.print();
    }
}
