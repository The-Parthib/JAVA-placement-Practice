import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        System.out.println(arr);
        
        arr2.addAll(arr);
        System.out.println(arr2);

        // arr.remove(Integer.valueOf(3));
        arr.remove(1);
        System.out.println(arr);

        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
