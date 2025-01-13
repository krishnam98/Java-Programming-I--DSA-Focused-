import java.util.*;
public class hw3 {
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    float pencil,pen,eraser;
    System.out.println("enter price");
    pencil=sc.nextFloat();
    pen=sc.nextFloat();
    eraser=sc.nextFloat();
    
    float price=pencil+(pencil*0.18f);
    float price1=pen+(pen*0.18f);
    float price2=eraser+(eraser*0.18f);


    System.out.print("PRICE OF PENCIL:");
    System.out.println(price);

    System.out.print("PRICE OF PEN:");
    System.out.println(price1);

    System.out.print("PRICE OF eraser:");
    System.out.println(price2);
    float total=price+price1+price2;

    System.out.print("total=");
    System.out.println(total);







    }
    

    
}
