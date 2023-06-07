interface Resume{
    public void biodata();
}

class Teacher implements Resume{
    String name,achive,qual;
    float exp;
    public void biodata(){
        name="Vishnu";
        qual="BE-CSE";
        achive="Q1 publication";
        exp=2.5f;
        System.out.println("Teacher Resume");
        System.out.println("Name:"+name);
        System.out.println("Qualification:"+qual);
        System.out.println("Achivement:"+achive);
        System.out.println("Experince: "+exp+" years");
        System.out.println("");
    }
}
class Student implements Resume{
    String name,dep;
    float result;
    public void biodata(){
        name="Rohit";
        dep="AI";
        result=8.5f;
        
        System.out.println("Student Resume");
        System.out.println("Name:"+name);
        System.out.println("Department:"+dep);
        System.out.println("Result: "+result+" CGPA");
        System.out.println("");
    }
}
public class InterfaceP {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher();
        obj1.biodata();
        Student obj2 = new Student();
        obj2.biodata();
    }
}
