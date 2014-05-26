import java.io.Console;
import java.util.Arrays;

public class Console01 {
    public static void main(String[] args) {
        Console cons = System.console();
        char[] password = cons.readPassword("[%s]", "Password:");
        System.out.println("password " + Arrays.toString(password));
    }
}
