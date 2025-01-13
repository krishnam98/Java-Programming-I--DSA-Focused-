import javax.imageio.stream.IIOByteBuffer;

public class getandsetter {
    public static void main(String args[]){
        BankAcc ba1=new BankAcc();
        BankAcc ba2=new BankAcc();


        ba1.username="krishnam";
        System.out.println(ba1.username);

        ba1.Setpass("k@123");
        System.out.println(ba1.GetPass());

        ba2.username="keishnam";
        System.out.println(ba2.username);

        ba2.Setpass("ke@123");
        System.out.println(ba2.GetPass());


        System.out.println(ba1.GetPass());

    }

    
}
class BankAcc{
    public String username;
    private String Password;
// getter
    public String GetPass(){
        return this.Password;
    }
// setter
    public void Setpass(String pwd){
        Password=pwd;
    }
}
