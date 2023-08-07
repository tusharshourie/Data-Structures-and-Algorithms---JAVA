import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add element
        list.add(0);
        list.add(3);
        list.add(5);
        System.out.println(list);

        //get elements
        int element = list.get(2);
        System.out.println(element);

        //add element in between
        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 7);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //count elements
        int size = list.size();
        System.out.println(size);

        //iteration
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }
        System.out.println();
        //sorting
        Collections.sort(list);
        System.out.println(list);       
        
    }
}