package Academy_of_pakhi;

public class Reverse {
    public static void main(String[] args) {
        String s = "ILoveMyIndia";
        String s1 = "Mango Jamun aam dudu pudding";
        String f = "";

        // StringBuilder sb = new StringBuilder(s);
        // StringBuilder rs = sb.reverse();
        // System.out.println(rs);

        // for (int i = s.length()-1; i >= 0; i--) {
        //     f += s.charAt(i);
        // }

        // System.out.println(f);

        String[] arr = s1.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if(i!=0) System.out.print(" ");
        }
    }
}
