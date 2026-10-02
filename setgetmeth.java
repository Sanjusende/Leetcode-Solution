public class setgetmeth {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        setgetmeth obj=new setgetmeth();
        obj.setName("Alice");
        obj.setAge(25);
        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
    }
}
