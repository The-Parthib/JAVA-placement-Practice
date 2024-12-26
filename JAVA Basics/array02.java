import java.util.Scanner;

public class array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myArr = new int[5];
        String [] array = new String[2];
        array[0] = "Parthib";
        array[1] = "Rupsa";
        System.out.println(array[0]);
        System.out.println(array[1]);
        int indx = 0;
        while (indx <myArr.length) {
            myArr[indx] = sc.nextInt();
            indx++;
        }
        sc.close();
        //Array Traversal
        System.out.println("Array Traversal \n\n");
        indx = 0;
        while (indx <myArr.length) {
            System.out.print(myArr[indx]+" ");
            indx++;
        }
    }
}
