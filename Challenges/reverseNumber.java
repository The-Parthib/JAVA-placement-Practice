public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(145));
    }

    public static int reverse(int num){
        int newNum = 0;
        int digit;
        while (num>0) {
            digit = num%10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
