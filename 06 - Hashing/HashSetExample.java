/* hashset is used to store a set of keys
 * uses hashtable to store these keys
 * and hash function to convert these keys to indexes
 * 
 * all the operations such as add, remove, contain are O(1) on avg
 */

 //TC = size, isEmpty = O(1)

 // if we use add fn and element is already present then it returns true
 //no guarantee of order during traversal
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("teo");
        h.add("tushar");
        h.add("shourie");
        System.out.println(h); // Output: [teo, tushar, shourie]

        System.out.println(h.size());

        h.remove("teo");

        System.out.println(h);


        System.out.println(h.size());

        System.out.println(h.contains("shourie")); // Output: true

        // Iterator<String> iterator = h.iterator();  //iterate through the hashset
        // while (iterator.hasNext())
        //     System.out.print(iterator.next() + " ");

        for(String s:h)
            System.out.println((s + " "));

        System.out.println(h.isEmpty()); //returns true if hashset is empty

        h.clear();
        System.out.println(h);
    }
}
