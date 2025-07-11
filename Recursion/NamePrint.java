package Recursion;

public class NamePrint {
    public static void main(String[] args) {
        printName(1, 5);
        // printNums(1, 5);
        // printRevNums(5, 5);
        backTracking(5, 5);
    }

    public static void printName(int i,int n){
        if(i>n) return;

        System.out.println("Riju");
        printName(i+1, n);
    }

    public static void printNums(int i, int n){
    if(i>n) return;
        System.out.print(i+" ");
        printNums(i+1, n);
    }
    public static void printRevNums(int i, int n){
    if(i<1) return;
        System.out.print(i+" ");
        printRevNums(i-1, n);
    }
    public static void backTracking(int i, int n){
    if(i<1) return;
    backTracking(i-1, n);
    System.out.print(i+" ");
    }
}
