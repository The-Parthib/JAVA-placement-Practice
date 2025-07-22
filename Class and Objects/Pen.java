

public class Pen {
    public static void main(String[] args) {
        PenStructure pen1 = new PenStructure();
        PenStructure pen2 = new PenStructure();
        PenStructure pen3 = new PenStructure("ball", "green");

        

        pen1.color = "Blue";
        pen2.color = "Red";

        pen1.showQty();
        // System.out.println(pen1.qty); // because of private
        System.out.println(pen1.getQty());

        pen1.setQty(766);
        pen1.showQty();

        pen1.PenColor();
        pen2.PenColor();
        pen3.PenColor();

    }
}
