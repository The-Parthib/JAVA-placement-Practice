import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        fibo(l);
        sc.close();
    }

    public static void fibo(int len){
        int fir = 0, sec = 1,third;
        System.out.print("0 1 ");
        while (fir + sec <= len) {
            third = fir+sec;
            System.out.print(third + " ");
            fir = sec;
            sec = third;
        }
    }
}
