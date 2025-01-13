public class overloading {
    public static void main(String args[]){
        Calc c1=new Calc();
        c1.sum(2,4);
        c1.sum((float)2.8,(float)8.2);
        c1.sum(2,4,5);
    }
    
}
class Calc{
    int sum(int a,int b){
        return (a+b);
    }

    float sum(float a,float b){
        return (a+b);
    }

    int sum(int a,int b,int c){
        return (a+b+c);
    }
}
