import java.util.ArrayDeque;

public class Deque01 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(4);
        deque.add(10);
        System.out.println("ArrayDeque " + deque);
    }
}
