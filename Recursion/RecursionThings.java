package Recursion;

public class RecursionThings {
    public static void main(String[] args) {
        // printName(1, 5);
        // printNums(1, 5);
        // printRevNums(5, 5);
        // backTracking(5, 5);
        // devisor(36);
        reversePrint(1, 9);
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
    backTracking(i-1, n); // not allowed (i+1,n)
    System.out.print(i+" ");
    }

    public static void devisor(int n){
        for (int i = 1; i*i<=n; i++) {
            if (n%i == 0) {
                System.out.print(i+" ");
                if ((n/i)!=i) {
                    System.out.print((n/i)+" ");
                }
            }
        }
    }
      
    public static void reversePrint(int i, int n){
        if(i>n) return;

        reversePrint(i+1, n);
        System.out.print(i+" ");
    }

}
