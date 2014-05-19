import java.util.Collection;
import java.util.ArrayList;

public class Collection01 {
    public static <T> Collection<T> copy(Collection<T> a, Collection<T> b) {
        b.clear();
        for (T i : a) {
            b.add(i);
        }
        return b;
    }

    /*
    public static <T> Collection<T> copy2(Collection<T> a, Collection<T> b) {
        b.clear();
        a.iterator()
    }
    */

    public static void main(String[] args) {
        Collection<Integer> cs = new ArrayList<Integer>();
        cs.add(4);
        for (Integer i: cs) {
            System.out.println(i);
        }

        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(3);
        x.add(2);
        ArrayList<Integer> y = new ArrayList<>();
        System.out.println("copy " + copy(x, y));
    }
}
