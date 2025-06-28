public class Function {  // method
    public static void main(String[] args) {
            greeting();
            int result = sum(23, 20);
            System.out.println("Function Addition result is : "+result);
    }

    public static void greeting(){
        System.out.println("Welcome and Good Morining..!!");
    }

    public static int sum(int x, int y){
        int sum = (x+y);
        return sum;
    }
}
