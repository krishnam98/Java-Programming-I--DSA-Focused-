// calculator for three numbers 
import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        float result;
    
        System.out.print("enter 1st number: ");
        float a=sc.nextFloat();
        System.out.print("enter 2nd number: ");
        float b=sc.nextFloat();
        System.out.print("enter operation: ");
        char operator=sc.next().charAt(0);

        if(operator=='+'){
            result =a+b;
            System.out.println(result);

            System.out.print("enter 3rd number");
        float c=sc.nextFloat();
        float result2;
        System.out.print("enter operator");
        char operator2=sc.next().charAt(0);

        if(operator2=='+'){
            result2=result+c;
            System.out.println(result2);

        }

        if(operator2=='-'){
            result2=result-c;
            System.out.println(result2);

        }

        if(operator2=='*'){
            result2=result*c;
            System.out.println(result2);

        }

        if(operator2=='/'){
            result2=result/c;
            System.out.println(result2);

        }


        }

        if(operator=='-'){
            result =a-b;
            System.out.println(result);
            System.out.print("enter 3rd number");
        float c=sc.nextFloat();
        float result2;
        System.out.print("enter operator");
        char operator2=sc.next().charAt(0);

        if(operator2=='+'){
            result2=result+c;
            System.out.println(result2);

        }

        if(operator2=='-'){
            result2=result-c;
            System.out.println(result2);

        }

        if(operator2=='*'){
            result2=result*c;
            System.out.println(result2);

        }

        if(operator2=='/'){
            result2=result/c;
            System.out.println(result2);

        }


        }

        if(operator=='*'){
            result =a*b;
            System.out.println(result);

            System.out.print("enter 3rd number");
        float c=sc.nextFloat();
        float result2;
        System.out.print("enter operator");
        char operator2=sc.next().charAt(0);

        if(operator2=='+'){
            result2=result+c;
            System.out.println(result2);

        }

        if(operator2=='-'){
            result2=result-c;
            System.out.println(result2);

        }

        if(operator2=='*'){
            result2=result*c;
            System.out.println(result2);

        }

        if(operator2=='/'){
            result2=result/c;
            System.out.println(result2);

        }


        }

        if(operator=='/'){
            result =a/b;
            System.out.println(result);

            System.out.print("enter 3rd number");
        float c=sc.nextFloat();
        float result2;
        System.out.print("enter operator");
        char operator2=sc.next().charAt(0);

        if(operator2=='+'){
            result2=result+c;
            System.out.println(result2);

        }

        if(operator2=='-'){
            result2=result-c;
            System.out.println(result2);

        }

        if(operator2=='*'){
            result2=result*c;
            System.out.println(result2);

        }

        if(operator2=='/'){
            result2=result/c;
            System.out.println(result2);

        }


        }

       






    }
    
}
