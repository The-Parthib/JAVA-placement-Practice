public class primeCheck {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(num+" is Prime..?? : "+isPrime(num));
        
    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i<num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
