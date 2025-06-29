public class Function {  // method
    public static void main(String[] args) {
            greeting();
            /*int a = 34;
            int b = 20;
            // float a = 34.9f;
            // float b = 20.6f;
            // float result = sum(a, b);
            int result = sum(a, b);
            System.out.println("Function Addition result is : "+result);*/


            // MultiplicationTable(7);

            System.out.println(factorial(5));
    }

    
    public static void greeting(){
        System.out.println("Welcome and Good Morining..!!");
    }
    /*
    public static int sum(int x, int y){
        int sum = (x+y);
        System.out.println("Executed Int Function");
        return sum;
    }
    public static float sum(float x,float y){
        float sum = (x+y);
        System.out.println("Executed Float Function");
        return sum;
    }

    public static void MultiplicationTable(int num){
        for (int i = 1; i < 11; i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
    */

    public static int factorial(int num){
        if (num == 0 || num == 1) {
            return 1;
        }
        return num*factorial(num-1);
    }
}
