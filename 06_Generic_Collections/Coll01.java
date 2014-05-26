import java.util.*;
import java.util.regex.*;

interface Inter {
    String x = "hello";
}

class Klasse implements Inter {
    String x = "holla";
    Klasse() {
        System.out.println("x " + x);
    }   
}

interface I1 {
    void start();
    void stop();
}

interface I2 {
    void stop();
    void remove();
}

class C1 implements I1, I2 {
    public void start() {}
    public void stop() {}
    public void remove() {}

    public C1() {
        stop();
    }
}


public class Coll01 {
    public static void main(String[] args) {
        List<Integer> is = new ArrayList<Integer>();
        is.add(4);
        is.add(6);
        is.remove(0);
        is.add(5);
        is.add(4);
        System.out.println("list " + is);

        Set<Integer> set = new HashSet<>();
        set.addAll(is);
        System.out.println("set " + set);

        List i = new ArrayList<Integer>();
        i.add(4);
        i.add("hello");
        System.out.println("raw " + i);

        Float.valueOf("3.4");

        Pattern pattern = Pattern.compile("(\\w+)\b");
        Matcher matcher = pattern.matcher("hello world");
        while (matcher.find()) {
            System.out.println("matcher " + matcher.group(1));
        }

        new Klasse();
    }
}
