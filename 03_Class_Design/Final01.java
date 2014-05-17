final class A {
    public void test() {
        System.out.println("final");
    }
}

abstract class C {
    public void test() {
        System.out.println("abstract");
    }
}

class D extends C {
}

class E {
    final int x;
    public E(int x) {
        this.x = x;
    }

    /*
    public int modify() {
        this.x = 1;
    }
    */
}

public class Final01 {
    public static void main(String[] args) {
       new D().test();
       //System.out.println("E.modify " + new E(10).modify());
    }
}
