import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //int num = sc.nextInt();
        int num = 153;
        int temp = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num = num / 10;
        }
        if(sum == temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
        sc.close();

    }
}
