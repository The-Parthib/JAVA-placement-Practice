public class Gcd {
    public static void main(String[] args) {
        int result = gcd(5,15);
        System.out.println("GCD : "+result);
    }

    public static int gcd(int a, int b){
        while (a>0 && b>0) {
            if (a>b) {
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if (a==0) {
            return b;
        }
        return a;
    }
}
