class StudentStr{
    String name;
    int age;
    String dpt;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.dpt);
    }

    public void studentInfo(String name){
        System.out.println("First : "+name);
    }
    public void studentInfo(String name , int age){
        System.out.println("Second : "+name+" "+age);
    }
    public void studentInfo(String name , int age , String dpt){
        System.out.println("Third : "+name+" "+age+" "+dpt);
    }

    //constructor non parametarized
    // StudentStr(){
    //     System.out.println("Hello Guys lets code..!!");
    // }

    //parametarized
    StudentStr(StudentStr s2){ //copy constructor
        this.age = s2.age;
        this.name = s2.name;
        this.dpt = s2.dpt;
    }

    StudentStr(){

    }
}

public class Student {
    public static void main(String[] args) {
        // StudentStr s1 = new StudentStr(); //constructor
        // s1.name = "Parthib";
        // s1.age  = 20;
        // s1.dpt = "CSE";

        //s1.studentInfo();

        StudentStr s1 = new StudentStr();
        s1.name = "Parthib";
        s1.age  = 20;
        s1.dpt = "CSE";

        s1.studentInfo(s1.name);
        s1.studentInfo(s1.name , s1.age);
        s1.studentInfo(s1.name,s1.age,s1.dpt);

        // StudentStr s2 = new StudentStr(s1); //copy constructor
        // s2.studentInfo();

    }
}

