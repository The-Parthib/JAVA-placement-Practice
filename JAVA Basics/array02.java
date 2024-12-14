import java.util.Scanner;

public class array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myArr = new int[10];
        String [] array = new String[2];
        array[0] = "Parthib";
        array[1] = "Rupsa";
        System.out.println(array[1]);
        int indx = 0;
        while (indx <myArr.length) {
            myArr[indx] = sc.nextInt();
            indx++;
        }
        sc.close();
        //Array Traversal
        indx = 9;
        while (indx <myArr.length) {
            System.out.print(myArr[indx]+" ");
            indx++;
        }
    }
}
