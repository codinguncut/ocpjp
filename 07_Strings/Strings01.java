import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 - substring
 - contains
 - format
 - indexOf
 - matches
 - split

 */

public class Strings01 {
    public static void main(String[] args) {
        String s = "hello world";
        String t = "hello world";
        System.out.println("substring " + s.substring(0, 5));
        System.out.println("contains " + s.contains("hello"));
        System.out.println("equal " + (s == t));
        System.out.println("indexOf " + s.indexOf("world"));
        System.out.println("matches " + s.matches("\\w+\\s\\w+"));
        Pattern pattern = Pattern.compile("\\w+");
        //System.out.println("split " + s.split("\\s+"));
    }
}
