public class E5 {
    public static void main(String[] args) {
        /*float myNum = 5;
        System.out.println(myNum);
        int myInt = (int) 7.8f;
        System.out.println(myInt);*/

        int num1 = 5;
        int num2 = 4;
        int num3 = -num2;
        System.out.println(num3);
        /*int temp;
        //Using third variable...
        temp = num1;
        num1 = num2;
        num2 = temp;*/
// without using third variable...
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("num1="+num1+"\nnum2="+num2);

        double x = 8;
        double y = 5;

        System.out.println(x%y);
    }
}
