package Recursion;

import java.lang.reflect.Array;

public class RecursionThings {
    public static void main(String[] args) {
        // printName(1, 5);
        // printNums(1, 5);
        // printRevNums(5, 5);
        // backTracking(5, 5);
        // devisor(36);
        // reversePrint(1, 9);
        // sumOfn(5, 0);
        // int result = sumOfn(5);
        // System.out.println(result);
        // int fact = fact(4);
        // System.out.println(fact);
        int arr[] = {2,3,5,7,8};
        reverseArray(0, arr, 5);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
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

    public static void sumOfn(int i,int sum){
        if (i<1) {
            System.out.println(sum);
            return;
        }
        sumOfn(i-1,sum+i);
    }

    public static int sumOfn(int n){
        if (n == 0 ) {
            return 0;
        }
        return n+sumOfn(n-1);
    }

    public static int fact(int n){
        if (n==0 || n== 1) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void reverseArray(int i,int arr[],int n){
        if (i >= n/2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverseArray(i+1, arr, n);
    }
}
