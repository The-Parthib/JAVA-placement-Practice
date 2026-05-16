package Academy_of_pakhi;

public class Example {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 12, 44};
        int countf = 0;

        int result = countEven(arr);

        int e = (result == 0) ? -1 : result;

        // System.out.println(e);

        double re = avgElements(arr);
        System.out.println(re);
   }

    private static int countEven(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] % 2 ==0) {
                count++;
            }
        }

        return count;
    }

    private static double avgElements(int[] arr){
        int sum = 0;
        for(int e : arr){
            sum += e;
        }

        return (double) sum/arr.length;
    }
}
