public class SwapNumbers {
    public static void main(String[] args) {
        int firstNum = 12;
        int secondNumber = 6;

        System.out.print("before a : "+firstNum);
        System.out.print("\nbefore b : "+secondNumber);

        // Bitwise OR
        // int result = firstNum & secondNumber;

        // Bitwise AND
        // int result = firstNum | secondNumber;

        // Bitwise XOR
        int result = firstNum ^ secondNumber;
        System.out.println("\nBitwise  : "+result);

        // swapping without third variable
        firstNum = firstNum + secondNumber;
        secondNumber = firstNum - secondNumber;
        firstNum = firstNum - secondNumber;

        System.out.print("\nafter a : "+firstNum);
        System.out.print("\nafter b : "+secondNumber);

        // ternary Numbers
        // int a = 120, b = 20;
        // int max = (a > b) ? a : b; // If a > b, max = a; otherwise, max = b
        // System.out.println("Maximum: " + max);

    }
}
