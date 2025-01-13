import java.util.*;

public class revision {
    // public static void hello(){
    //     System.out.print("hello world");
    // }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        // System.out.print("PLEASE ENTER YOUR NAME: ");
        // String name=sc.nextLine();

        // System.out.print("PLEASE ENTER YOUR AGE: ");
        // int age=sc.nextInt();



        // System.out.println("your name is "+name);
        // System.out.println("your age is "+age);


        //**typecasting**


        // int a=3;
        // float b=a;
        // System.out.print(a+"\t"+b);

        // **largest number**

        // int a =19;
        // int b= 2;
        // int c=39;
        // int max=a;
        // if(max<b){
        //     max=b;
        // }
        // if(max<c){
        //     max=c;
        // }
        // System.out.print(max);

        // **reversing a number**

    //    System.out.print("ENTER NUMBER: ");
    //    int n=sc.nextInt();
    //     for(int k=n; k>0 ; k=k/10){
    //         int r=k%10;
    //         System.out.print(r);


    //     }
    // **saving reversed number**
     
        // System.out.print("ENTER NUMBER: ");
        // int n=sc.nextInt();
        // int rev=0;
        //  for(int k=n; k>0 ; k=k/10){
        //      int r=k%10;
        //      rev=(10*rev)+r;
        //  }
        //  System.out.print(rev);


        // **function**
        // hello();

        // **binarytodecimal**
// System.out.print("ENTER NUMBER (from binary system): ");
//         int number=sc.nextInt();
//         int i=0;
//         int sum=0;
//         while(number>0){
//             int r=number%10;
//             sum=sum+ (r* (int)Math.pow(2,i));
//             i++;
//             number=number/10;
//         }
//         System.out.print(sum);

// **decimaltobinary**
// int n=5;
// int d=0;
// int i=0;
// while(n>0){
//     int r=n%2;
//     d=(r* (int) Math.pow(10,i))+d;
//     i++;
//     n=n/2;
// }
// System.out.print(d);

// **square root**
// System.out.println(Math.sqrt(72));
        
// **sum of digit**

// int n=98302;
// int sum=0;

// while(n>0){
//     int r=n%10;
//     sum=sum+r;

//     n=n/10;
// }
// System.out.println(sum);

// ****PATTERNS****
// **hollow rectangle** 
// int n=4;

// for(int i=1; i<=4;i++){
//     for(int j=1;j<=10;j++){
//         if(i==1||i==4||j==1||j==10){
//             System.out.print("*");
//         }
//         else{System.out.print(" ");}
//     }
//     System.out.println();
// }
// **inverted and rotated pyramid**

// for(int i=1;i<=4;i++){
//     for(int j=1;j<=4;j++){
//         if(j<=(4-i)){
//             System.out.print(" ");
//         }
//         else{
//             System.out.print("*");
//         }
//     }
//     System.out.println();
// }

// **inverted triangle with numbers**

// for(int i=5;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

// **floyd triangle**
// int n=5;
// int j=1;
// for(int i=1;i<=n;i++){
//     for(int k=1;k<=i;k++){
//         System.out.print(j+"\t");
//         j++;

//     }
//     System.out.println();
// }

// **0-1binary pyramid

// for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         if((i%2==0 && j%2==0)  || (i%2!=0 && j%2!=0)){
//         System.out.print(1+"\t");
//     }

//         else{
//             System.out.print(0+"\t");
//         }
//     }
//     System.out.println();
// }






    }
    
}
