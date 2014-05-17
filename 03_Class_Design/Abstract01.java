abstract class A {
    protected int x;
    public A() {
        this.x = 4;
    }
    public int mult() {
        return x*2;
    }

    public String toString() {
        return "A(" + this.x + ")";
    }
}

class B extends A {
    public int mult() {
        return super.mult();
    }

    public A test() {
        return this;
    }

    public String toString() {
        return "B("+ this.x + ")";
    }
}

public class Abstract01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("b " + b.mult());

        System.out.println("test " + (B)b.test());
    }
}
