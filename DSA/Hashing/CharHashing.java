package DSA.Hashing;

public class CharHashing {
    public static void main(String[] args) {
        String s = "abcABdabcAAAxyzfe";
        int result = countChar(s, 'A');
        System.out.println(result);
    }

    public static int countChar(String s, char c){
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            // int j = s.charAt(i)-'a';
            // int j = s.charAt(i)-'A';
            hash[s.charAt(i)]++;  // all
            // hash[j]++;
        }
        // return hash[c-'a']; // in case all are lower case
        // return hash[c-'A']; // in case all Upper case
        return hash[c]; // in case all are strings
    }
}
