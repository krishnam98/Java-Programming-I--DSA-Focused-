import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class filehandeling {
    public static void main(String args[]){
        // creating a File
        File file=new File("krishnam.txt");
       try( FileReader r=new FileReader("krishnam.txt")) {
            int ch;
        while((ch=r.read())!=-1){  //-1 represents End Of File
            System.out.print((char)ch);
        }
       } catch (IOException e) {
        // TODO: handle exception
        e.printStackTrace();
       }
    }
    


}
