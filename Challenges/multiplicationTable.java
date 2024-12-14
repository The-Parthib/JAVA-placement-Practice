import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplication table of : ");
        int num = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num+" x "+ i +"= "+(i*num));
        }
        sc.close();
    }
}