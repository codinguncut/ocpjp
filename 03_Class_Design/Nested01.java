class Nested {
    public class Inner {
        public void test() {
            System.out.println("Inner");
        }
    }

    public static class Static {
        public void test() {
            System.out.println("Static");
        }
    }

    public void foo() {
        class Local {
            public void test() {
                System.out.println("Local");
            }
        }
        new Local().test();
    }

    public void anon() {
        Inner x = new Inner() {
            public void test() {
                System.out.println("Anonymous");
            }
        };
        x.test();
    }
}

public class Nested01 {
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.new Inner().test();
        new Nested.Static().test();
        nested.foo();
        nested.anon();
    }
}
