import java.io.File;
import java.util.*;
public class FileH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fname=in.next();
        File f1= new File("\\C:\\Users\\vishn\\OneDrive\\Desktop\\java.txt\\");
        System.out.println("File Name: "+f1.getName());
        f1.setWritable(false);
        System.out.println(f1.exists() ? "File exixt" : "File don't exist");
        System.out.println(f1.canRead() ? "File Readable" : "File is not Readable");
        System.out.println(f1.canWrite() ? "File Writeable" : "File is not Writable");
        String file=f1.toString();
        int index = file.lastIndexOf('.');
        if(index > 0){
            String type=file.substring(index+1);
            System.out.println("File Type is "+type);
        }
        else{
            System.out.println("File has no type");
        }
        System.out.println("Size of file: "+f1.length()+"Bytes");
    }
}
