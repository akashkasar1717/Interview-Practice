package core;

class Superclass {
    void foo() throws RuntimeException {
        throw new NullPointerException("RuntimeException in Superclass");
    }
}

class Subclass extends Superclass {
    @Override
    void foo() throws NullPointerException {
        throw new NullPointerException("NullPointerException in Subclass");
    }
}

public class Main {
    public static void main(String[] args) {
        Superclass obj = new Subclass();
        obj.foo();
    }
}
