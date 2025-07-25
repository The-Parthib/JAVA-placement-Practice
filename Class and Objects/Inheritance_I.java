class shaPe{
    public void area(){
        System.out.println("area of the shape ");
    }
}

class Triangle extends shaPe{
    public void area(int l,int h){
        System.out.println("Area : "+(0.5*l*h));
    }
}

public class Inheritance_I {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        t1.area();
        t2.area(5, 3);
    }
}
