class A<T> {
    public String toString() {
        return "A";
    }
}

class B<T> extends A<T> {
    public String toString() {
        return "B";
    }
}

abstract class Plonkable<T extends Number> {
    T x;
    public T plonk(T x) {
        this.x = x;
        return x;
    }
}

class C<T extends Number> extends Plonkable<T> {
    T x;
    public C(T x) {
        this.x = x;
    }
}

public class Generic_Inheritance01 {
    public static void main(String[] args) {
        A<Integer> a = new A<>();
        B<Integer> b = new B<>();
        System.out.println(a + ", " + b);

        C<Double> c = new C<>(4.0);
        System.out.println(c.plonk(5.0));
    }
}
