public class Challenges {
    public static void main(String[] args) {
        // System.out.println(sumOfDigits(123456));

        // System.out.println(lcm(15,20));
        System.out.println(isPrime(4));
    }

    /*
    static int sumOfDigits(int num){
        int sum = 0;
        while (num>0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
        */

    // static int lcm(){
    //     int num = 0;
    //     for (num = 1; num < 100; num++) {
    //         if (num%15 == 0 && num%20 == 0) {
    //             return num;
    //         }
    //     }
    //     return 0;
    // }

    // optimized
   /*  static int lcm(int x, int y){
        int i = 1;
        while (true) {
            int factor = x*i;
            if (factor % y == 0) {
                return factor;
            }
            i++;
        }
    }
        */

    static boolean isPrime(int num){
        int i = 2;
        while (i< num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
