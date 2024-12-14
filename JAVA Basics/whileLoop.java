public class whileLoop {

    public static void startPrint(){
            int i = 1, j = 1;
            while (i<=20) {
            System.out.println("");
            j = 1;
            while (j<=i) {
                System.out.print("* ");
                j++;
            }
            i++;
            }
        }

    public static void main(String[] args) {
        // int num = 1;
        /*while (num<15) {
            System.out.print(num+" | ");
            num++;
        }
        System.out.println("\n\n");
        int rev = 100;
        while (rev>0) {
            System.out.print(rev + " | ");
            rev--;
        }*/

        startPrint();
    }
}
