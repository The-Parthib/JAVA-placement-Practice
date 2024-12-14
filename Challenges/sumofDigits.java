public class sumofDigits {
    public static void main(String[] args) {
        int a = sumofD(548);
        System.out.println(a);
    }

    public static int sumofD(int num){
        int sum = 0;
        while (num>0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
