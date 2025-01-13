import java.util.*;
public class oopsQ1 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.print("enter 1st number's real part= ");
        int r1=sc.nextInt();

        System.out.print("imaginary part= ");
        int i1=sc.nextInt();

        System.out.print("enter 2nd number's real part= ");
        int r2=sc.nextInt();

        System.out.print("imaginary part= ");
        int i2=sc.nextInt(); 

        Complex c=new Complex();
        System.out.println("sum is:- ");
        c.Sum(r1, i1, r2, i2);

        System.out.println("difference is:- ");
        c.Difference(r1, i1, r2, i2);

        System.out.println("product is:- ");
        c.product(r1, i1, r2, i2);











       
    }

    
}

class Complex {
    
   void Sum( int r1, int i1,int r2,int i2){
    int r=r1+r2;
    int i=i1+i2;
    if(i>0){
        System.out.println(r+"+"+i+"i");
    }
    if(i<0){
        System.out.println(r+""+i+"i");
    }
    if(i==0){
        System.out.println(r);
    }

   }


   void Difference( int r1, int i1,int r2,int i2){
    int r=r1-r2;
    int i=i1-i2;
    if(i>0){
        System.out.println(r+"+"+i+"i");
    }
    if(i<0){
        System.out.println(r+""+i+"i");
    }
    if(i==0){
        System.out.println(r);
    }

   }

   void product( int r1, int i1,int r2,int i2){
    int r_1=r1*r2;
    int i_1=r1*i2;
    int i_2=i1*r2;
    int r_2=i1*i2*(-1);

    Sum(r_1, i_1, r_2, i_2);
   }


 
}
