public class OccurencesArray {
    public static void main(String[] args) {
        int[] nArray = {2,4,5,3,2,6,7,1,9,2,12,2,11,30};
        int count = 0;
        // for each loop
        for(int num : nArray){
            System.out.print(num+" ");
            if (num == 2) {
                count++;
            }
        }
        System.out.println("\n2 is present in the array "+count+" times");
        double sum = ArraySumAvg.sumArr(nArray);
        System.out.println(sum);
    }
}