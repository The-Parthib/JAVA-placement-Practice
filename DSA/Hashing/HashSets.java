package DSA.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //adding
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(4);

        System.out.println(set);
        
        // remove 
        // set.remove(1);
        // if (!set.contains(1)) {
        //     System.out.println("not present 1");
        //     System.out.println(set);
        // }

        System.out.println("set size "+set.size());

        // As set doesn't have index so we need to import iterator to traverse the set
        Iterator it = set.iterator();
        // two main functions
        // hasnext() and next();
        /* 
        System.out.println(it.hasNext());

        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println(it.hasNext());
            */
            while (it.hasNext()) {
                System.out.print(it.next()+" ");
            }

            // for each loop
            // for (Integer integer : set) {
            //     System.out.print(integer+" ");
            // }
    }
}
