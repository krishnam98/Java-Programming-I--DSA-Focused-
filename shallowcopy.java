public class shallowcopy {

    //only for arrays
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="krishnam";
        s1.roll=27;
        s1.marks=new int[3];
        s1.marks[0]=100;
        s1.marks[1]=60;
        s1.marks[2]=90;

        Student s2=new Student(s1); //values are copied
       s1.marks[2]=100;
        for(int i=0;i<3;i++) { 
            System.out.println(s2.marks[i]);
        }


    }
    
}


class Student{
    String name;
    int roll;
    int marks[];


Student(){
}

//copy constructor
// Student(Student s1){
    // marks=new int [3];
//     this.name=s1.name;
//     this.roll=s1.roll;
//     this.marks=s1.marks;
// }


//deep copy constructor
Student(Student s1){
    marks=new int[3];
    for(int i=0;i<3;i++){
        this.marks[i]=s1.marks[i]; //ek ek value ko copy karega.

    }
}
}