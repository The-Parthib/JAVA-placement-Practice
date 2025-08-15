public class PalindromePractice {
    public static void main(String[] args) {
        Solution rs = new Solution();
        boolean b = rs.isPalindrome(124);
        System.out.println(b);
    }
}

class Solution{
    public boolean isPalindrome(int n){
        int last = 0, result = 0, original = n;
        while(n>0){
            last = n%10;
            result = (result*10)+last;
            n = n/10;
        }
        return result == original ? true : false;
    }
}
