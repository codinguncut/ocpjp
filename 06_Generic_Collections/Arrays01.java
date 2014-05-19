import java.util.ArrayList;
import java.util.HashMap;

class A {
    int x;
    public A(int x) {
        this.x = x;
    }

    public String toString() {
        return "A " + this.x;
    }
}

public class Arrays01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hit");
        arr.add("the");
        arr.add("road");
        arr.add("jack");
        System.out.println("ArrayList " + arr);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(4,  "hello");
        map.put(10, "world");
        System.out.println("HashMap " + map);

        HashMap<A, String> hash = new HashMap<>();
        hash.put(new A(4), "hello");
        hash.put(new A(10), "hello");
        System.out.println("HashMap A " + hash);
    }
}
