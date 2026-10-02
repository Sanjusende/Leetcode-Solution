public class copyconstructor {
    private String name;
    private int age;

    // Default constructor
    public copyconstructor() {
        this.name = "";
        this.age = 0;
    }

    // Parameterized constructor
    public copyconstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public copyconstructor(copyconstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
