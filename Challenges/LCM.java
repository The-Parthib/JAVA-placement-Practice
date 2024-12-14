public class LCM {
    public static void main(String[] args) {
        int first = 14;
        int second = 7;
        int result = lcm(first, second);
        System.out.println("LCM of "+first+" & "+second+" is : "+result);
    }


    public static int lcm(int first , int second){
        int i = 1;
        while (i<=second) {
            int factor = first*i;
            if (factor%second == 0) {
                return factor;
            }
            i++;
        }
        return 0;
    }
}
