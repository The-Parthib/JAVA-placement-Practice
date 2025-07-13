package DSA.Hashing;

public class Hash01 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5,4,2,6,2,3,2,3,2};

        int result = Hashing(12, arr);
        System.out.println(result);

    }

    public static int Hashing(int num, int[] arr){
        int size = arr.length;
        int[] hash = new int[size+1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        if (num<0 || num>=hash.length) {
            System.out.println(num+" is not present in the Array");
            return 0;
        }

        // try {
        //     return hash[num];
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }
        return hash[num];
    }
}
