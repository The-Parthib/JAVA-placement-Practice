import java.util.Scanner;

public class factFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial of : ");
        int k = sc.nextInt();
        int j =fact(k);
        System.out.println(k+"! = "+j);
        sc.close();
    }

    public static int fact(int num){
        if (num == 0 || num == 1) {
            return 1;
        }
        else{
            return (num * fact(num-1));
        }
    }
}
