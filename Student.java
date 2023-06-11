import java.util.*;
public class Student {
    String usn,name,branch;
    long phone;
    
    void insertStudent(String reg,String nm,String br,long ph){
        usn=reg;
        name=nm;
        branch=br;
        phone=ph;
    }
    
    void displayStudents(){
        System.out.println("************");
        System.out.println("USN: "+usn);
        System.out.println("Name: "+name);
        System.out.println("Branch: "+branch);
        System.out.println("Phone No.: "+phone);
        System.out.println("************");
    }
    
    public static void main(String[] args) {
        
        Student st[]= new Student[20];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of students: ");
        int n=in.nextInt();
        
        for(int i=0;i<n;i++){
            st[i]=new Student();
        }
        for(int j=0;j<n;j++){
            System.out.println("Enter USN,Name,Branch,Phone No.");
            String usn=in.next();
            String name=in.next();
            String branch=in.next();
            long phone=in.nextLong();
            st[j].insertStudent(usn, name, branch, phone);
        }
        
        for(int m=0;m<n;m++){
            System.out.format("Student %d Details:\n",m+1);
            st[m].displayStudents();
        }
    }
}
