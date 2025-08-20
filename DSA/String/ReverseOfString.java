package DSA.String;



public class ReverseOfString {


    public static String reverseWordInaString(String word){
        char[] wordArr = word.toCharArray();
        int left = 0, right = word.length()-1;
        while(left<right){
            char temp =  wordArr[left];
            wordArr[left] = wordArr[right];
            wordArr[right] = temp;
            left ++ ;
            right--;
        }
        return new String(wordArr);
}
    public static void main(String[] args) {
        String s = "I am a Boy";
    //   String[] rs = s.split(" ");

    //   for (int i = rs.length-1; i >= 0; i--) {
    //     System.out.print(rs[i]+" ");
    //   }

      String g = reverseWordInaString(s);
      System.out.println(g);

    }
}
