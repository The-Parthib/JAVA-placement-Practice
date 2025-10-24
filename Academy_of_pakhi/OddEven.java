package Academy_of_pakhi;

public class OddEven {
    public static void main(String[] args) {
        int a = 5;
        checkOddEven(a);
    }

//+++++++++++++++++++++ || +++++++++++++

    static void checkOddEven(int a){
        if(a%2 == 0){
            System.err.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

// even -> 5/2 = 0 | rem == 0
// odd -> 5/2 != 0 | rem != 0

// n > 10 -> yes
// n < 10 -> No