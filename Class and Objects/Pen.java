class PenStructure{
    String type;
    String color;

    public void write(){
        System.out.println("Writing Something");
    }
    public void PenColor(){
        System.out.println(this.color);
    }
}

public class Pen {
    public static void main(String[] args) {
        PenStructure pen1 = new PenStructure();
        PenStructure pen2 = new PenStructure();

        pen1.color = "Blue";
        pen2.color = "Red";

        pen1.PenColor();;
        pen2.PenColor();;
    }
}
