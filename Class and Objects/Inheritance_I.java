class shaPe{
    public void area(){
        System.out.println("area of the shape ");
    }
}

class Trianglee extends shaPe{
    public void area(int l,int h){
        System.out.println("Area : "+(0.5*l*h));
    }
}

public class Inheritance_I {
    public static void main(String[] args) {
        Trianglee t1 = new Trianglee();
        Trianglee t2 = new Trianglee();
        t1.area();
        t2.area(5, 3);
    }
}
