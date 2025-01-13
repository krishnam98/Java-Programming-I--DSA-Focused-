import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String args[]){
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int count=0;
        while(true){
            System.out.print("Guess a number: ");
            int user_value=sc.nextInt();
            int comp_value=rand.nextInt(100);
            count++;
            if(user_value==comp_value){
                System.out.println("Congratulations you won!");
                System.out.println("No of attempts: "+count);
                break;
            }
            else{
                System.out.println("You guessed a wrong number!");
                if(user_value<comp_value){
                    System.out.println("your guess was too low!");
                }

                else{
                    System.out.println("your guess was too high!");
                }
            }
            
        }

       


    }
}
