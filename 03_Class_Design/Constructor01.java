class A {
    int x;
    public int y;
    protected int z;
    private int a;

    public A(int x, int y, int z, int a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
    }

    public String toString() {
        return "A " + this.x + ", " + this.y + ", " + this.z + ", " + this.a;
    }
}

class B extends A {
    public B() {
        super(1,2,3,4);
    }

    public String toString() {
        return "B: " + super.toString();
    }

    public void modify() {
        this.x = 5;
    }

    public int test(int i) {
        System.out.println("int " + i);
        return i;
    }

    public int test(long i) {
        System.out.println("long " + i);
        return (int) i;
    }
}

public class Constructor01 {
    public static void main(String[] args) {
        A a = new A(10, 20, 30, 40);
        System.out.println(a);

        B b = new B();
        System.out.println(b);

        b.test((int) 4);
        b.test((long) 4);
    }
}
