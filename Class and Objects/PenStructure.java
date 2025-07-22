public class PenStructure{
    String type;
    String color;
    private int qty = 100;

    public void write(){
        System.out.println("Writing Something");
    }
    public void PenColor(){
        System.out.println(this.color);
    }

    // getter
    public int getQty(){
        return qty;
    }

    // setter
    public void setQty(int qty){
        this.qty = qty;
    }

    // view
    public void showQty(){
        System.out.println(qty+" from private");
    }
    
    public PenStructure(){

    }

    public PenStructure(String type,String color){
        this.type = type;
        this.color = color;
    }
}