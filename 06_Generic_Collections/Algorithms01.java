import java.util.*;

class A implements Comparable<A> {
    int x, y;
    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "A(" + this.x + ", " + this.y + ")";
    }

    @Override
    public int compareTo(A other) {
        int comp = this.y - other.y;
        if (comp == 0) {
            return this.x - other.x;
         } else {
            return comp;
         }
    }
}

public class Algorithms01 {
    public static void main(String[] args) {
        ArrayList<A> al = new ArrayList<>();
        al.add(new A(1,5));
        al.add(new A(3,3));
        al.add(new A(5,4));
        al.add(new A(3,4));
        al.add(new A(5,2));
        System.out.println("al " + al);

        Collections.sort(al); // comparator
        System.out.println("al " + al);

        /*
        Comparator<A> c = new Comparator<A>() {
            public int compare(A a, A, b) {
                
            }
        }
        */

        //Collections.binarySearch(al, 
    }
}
