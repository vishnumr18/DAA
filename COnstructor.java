
public class COnstructor {
    int id;
    String name;

    public COnstructor() {
        
        System.out.println("this is a default constrictour");
        System.out.println("ID:"+id+" Name: "+name);
    }
    public COnstructor(int i,String nm){
        id=i;
        name=nm;
        System.out.println("This is paramiterised constructor");
        System.out.println("ID:"+id+" Name: "+name);
        
    }
    public static void main(String[] args) {
        COnstructor c = new COnstructor();
        COnstructor pc = new COnstructor(1,"Vishnu");
    }
}
