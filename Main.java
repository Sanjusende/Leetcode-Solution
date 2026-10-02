abstract class AbstractClass {
    abstract void display();// Abstract method - must be implemented by subclasses
    abstract void show();
}

class A extends AbstractClass {
    void display() {
        System.out.println("Hello from class A!");
    }

    void show() {
        System.out.println("Hello from show in class A!");
    }
}

class B extends AbstractClass {
    void display() {
        System.out.println("Hello from display in class B!");
    }

    void show() {
        System.out.println("Hello from class B!");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        a.show();

        B b = new B();
        b.display();
        b.show();
    }
}