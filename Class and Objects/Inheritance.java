class shape{
    String color;
}
class Triangle extends shape{
    public void Info(){
        System.out.println("Shape default colour : "+super.color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "aqua";
        t1.Info();
    }
}
