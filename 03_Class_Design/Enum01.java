enum MyEnum {
    ABC("john"), DEF("bert"), GHI("larry");

    private String name;
    private MyEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class Enum01 {
    public static void main(String[] args) {
        System.out.println("enum " + MyEnum.ABC);
        System.out.println("name " + MyEnum.ABC.getName());
    }
}
