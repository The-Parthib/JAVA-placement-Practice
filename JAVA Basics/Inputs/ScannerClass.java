package Inputs;

import java.util.*;

public class ScannerClass {
    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        String[] numbers = input.split(",");
        System.out.println(numbers.length);
        // for (String number : numbers) {
        //     System.out.println(number);
        // }
        // System.out.println(numbers.getClass());
    }
}
