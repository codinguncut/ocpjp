interface I {
    public int add(int a, int b);
}

class A implements I {
    public int add(int a, int b) {
        return a+b;
    }
}

class B extends A {
    public int add(int a, int b) {
        return a*b;
    }
}

public class Inheritance01 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("add " + a.add(1,2));

        B b = new B();
        System.out.println("add " + b.add(1,2));

        System.out.println("isinstanceof " + (b instanceof A));

        I[] iss = {a, b};
        for (I i: iss) {
            System.out.println("i " + i.add(1,2));
            System.out.println("inst A " + (i instanceof A));
            System.out.println("inst B " + (i instanceof B));
        }
    }
}
