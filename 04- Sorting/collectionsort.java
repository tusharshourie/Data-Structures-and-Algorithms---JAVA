import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
        return this.x - p.x;
    }
}

public class collectionsort {
    public static void main(String[] args) {
        ArrayList<Point> list = new ArrayList<Point>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));
        list.add(new Point(10, 30));
        Collections.sort(list);
        for (Point p : list) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
