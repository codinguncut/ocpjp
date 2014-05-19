import java.util.ArrayList;
import java.util.Iterator;

public class Iterator01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(10);
        Iterator<Integer> iter = arr.iterator();
        while (iter.hasNext()) {
            Integer ii = iter.next();
            System.out.println(ii);
        }
    }
}
