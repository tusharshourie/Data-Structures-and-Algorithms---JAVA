import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

class MyCmp implements Comparator<Point>
{
    public int compare(Point p1, Point p2){
        return p1.x - p2.x;
    }
}
public class collectionsort2 {
    public static void main(String[] args) {
        ArrayList <Point> list = new ArrayList<Point>();
        list.add(new Point(5, 10));
        list.add(new Point(10, 15));
        list.add(new Point(25, 30));
        Collections.sort(list, new MyCmp());
        for(Point p : list){
            System.out.println(p.x + " " + p.y);
        }
    }
}
