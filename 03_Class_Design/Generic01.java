import java.util.ArrayList;

interface Stack<E> {
    void clear();
    void push(E elt);
    E pop();
    int length();
}

class TheStack<E> implements Stack<E> {
    private ArrayList<E> elements = new ArrayList<>();
    public void clear() {
        elements.clear();
    }

    public int length() {
        return elements.size();
    }

    public void push(E elt) {
        elements.add(elt);
    }

    public E pop() {
        return elements.remove(elements.size()-1);
    }
}

public class Generic01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new TheStack<Integer>();        
        stack.clear();
        stack.push(4);
        System.out.println("pop " + stack.pop());
        System.out.println("length " + stack.length());
    }
}
