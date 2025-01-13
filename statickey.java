public class statickey{
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolname="asg";

        Student s2=new Student();
        
        System.out.print(s2.schoolname);
    }

}

class Student{
    String name;
    int roll;

    static String schoolname;

}