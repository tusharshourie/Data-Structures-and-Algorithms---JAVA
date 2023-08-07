/* Hashmap used to store key value pairs
 * 
 * TIME = put, containsKey, remove are O(1)
 *        get also O(1)
 *         size, isEmpty also O(1) in worst case
 */

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<String,Integer>();
        m.put("abc", 1);
        m.put("def", 2);
        m.put("ghi", 3);
        m.put("jkl", 4);
        System.out.println(m);
        System.out.println(m.size());

        //containsKey
        if(m.containsKey("ghi"))
            System.out.println("yes");
        else
            System.out.println("no");

        //remove
        m.remove("def");
        System.out.println(m.size());

        System.out.println(m.get("hello"));

        for(Map.Entry<String, Integer> entry: m.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
