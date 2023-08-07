import java.util.*;
public class frequencyofarrayelements {
    static void countFreq(int arr[]){
        HashMap<Integer, Integer>h = new HashMap<Integer, Integer>();
        for(int x: arr)
            h.put(x, h.getOrDefault(x,0) +1);
            for (Map.Entry<Integer, Integer> e : h.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
    }
}

    public static void main(String[] args) {
        int arr[] = {50,50,60,10,70,70,10,101,10,10};
        countFreq(arr);
    }
}
//TIME = Theta(n)
//Space= O(n)