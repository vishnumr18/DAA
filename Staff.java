import java.util.*;
public class Staff {
    String staffid,name;
    float salary;
    long phone;
    
    public void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Staff ID");
        staffid=in.next();
        System.out.println("Enter Name");
        name=in.next();
        System.out.println("Enter salary");
        salary=in.nextFloat();
        System.out.println("Enter Phone No.");
        phone=in.nextLong();
    }
    public void displayData(){
        System.out.println("Staff ID: "+staffid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Phone No.: "+phone);
    }
}

class Teaching extends Staff{
    String domain;
    int n;
    
    void getTeachingData(){
        super.getData();
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Domain");
        domain=in.next();
        System.out.println("Enter No. of Publications");
        n=in.nextInt();
    }
    void displayTeachingData(){
        super.displayData();
        System.out.println("Domain: "+domain);
        System.out.println("Publications: "+n);
        System.out.println("");
    }
}

class Technical extends Staff{
    String skill;
    void getTechnicalData(){
        super.getData();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Skills");
        skill=in.nextLine();
    }
    void displayTechnicalData(){
        super.displayData();
        System.out.println("Skils:"+skill);
        System.out.println("");
    }
}

class Contract extends Staff{
    float period;
    
    void getContractData(){
        super.getData();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Contract Time");
        period=in.nextFloat();
    }
    void displayContractData(){
        super.displayData();
        System.out.println("Contract Period: "+period);
        System.out.println("");
    }
}

class Four{
    public static void main(String[] args) {
        Teaching teaching = new Teaching();
        System.out.println("Enter Teaching Data");
        teaching.getTeachingData();
        
        Technical technical = new Technical();
        System.out.println("Enter Technical Data");
        technical.getTechnicalData();
        
        Contract contract = new Contract();
        System.out.println("Enter Contract Data");
        contract.getContractData();
        
        System.out.println("Teaching Details are");
        teaching.displayTeachingData();
        
        System.out.println("Technical Detailas are");
        technical.displayTechnicalData();
        
        System.out.println("Contract Details are");
        contract.displayContractData();
    }
}