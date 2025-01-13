import java.util.*;
public class largestof3alter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        System.out.print("enter a: ");
        a=sc.nextFloat();
        System.out.print("enter b: ");
        b=sc.nextFloat();
        System.out.print("enter c: ");
        c=sc.nextFloat();

        if(a>b){
        if(c>a){
            System.out.println("c is largest");
        }
        else if(a==c&&c!=b){
            if(b>c){ System.out.println("b is greater");}
        else{ System.out.println("a=c &greater than b");}
        }

        else{ System.out.println("a is greater");}
        }

        else if(b>a){
            if(c>b){ System.out.println("c is greater");}
            else if(c==b&&a!=c){
                if(a>c){ System.out.println("a is greater");}
                else{ System.out.println("c=b greater than a");}
            }

            else{ System.out.println("b is greater");}

        }

        if(a==b&&a!=c&&b!=c){
            if(a>c){ System.out.println("a=b & greater than c");}
            else{System.out.println("c ic largest");}
        }
        if(a==b&&b==c&&c==a){
            System.out.println("all are equal");
        }
       
    
    
    
    
    
    }}
