import java.util.*;
public class accessmodifier {
    public static void main(String args[]){
       
        BankAccount ba1=new BankAccount();
        ba1.username="krishnam";
       
        ba1.Setpassword("k@123");
    }
        
}


class BankAccount{
    public String username;
    private String Password;
    public void Setpassword(String pwd){
        Password=pwd;
    } 
}

