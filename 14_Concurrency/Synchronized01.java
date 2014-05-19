class A {
    int x;
    public synchronized int contend() {
        x++;
        return x;
    }
}

class B {
    int x;
    public int contend() {
        synchronized (B.class) {
            x++;
            return x;
        }
    }
}

public class Synchronized01 {
    public static void main(String[] args) {
       A a = new A();
       System.out.println("A.contend " + a.contend());
       System.out.println("B.contend " + new B().contend());
    }
}
