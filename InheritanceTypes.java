// ============================================================
//   JAVA INHERITANCE - SABHI 5 TYPES KA COMPLETE CODE
//   (Hinglish comments ke saath - Students ke liye)
// ============================================================


// ===========================================================
// 1. SINGLE INHERITANCE
//    Ek parent class → Ek child class
// ===========================================================

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " khaana kha raha hai!");
    }

    void breathe() {
        System.out.println(name + " saans le raha hai!");
    }
}

class Dog extends Animal {  // Dog ne Animal se saari properties li

    Dog(String name) {
        super(name);  // Parent ka constructor call kiya
    }

    void bark() {
        System.out.println(name + " bhaunk raha hai - Bhow Bhow!");
    }
}


// ===========================================================
// 2. MULTILEVEL INHERITANCE
//    Animal → Dog → Puppy  (Chain banti hai)
// ===========================================================

class Dog2 extends Animal {

    Dog2(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " bhaunk raha hai!");
    }
}

class Puppy extends Dog2 {  // Puppy ko Animal + Dog2 dono ki cheezein milti hain

    Puppy(String name) {
        super(name);
    }

    void weep() {
        System.out.println(name + " ro raha hai - Kyun Kyun!");
    }
}


// ===========================================================
// 3. HIERARCHICAL INHERITANCE
//    Ek parent → Bahut saare children
// ===========================================================

class Cat extends Animal {  // Cat bhi Animal se inherit kar rahi hai

    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " bol rahi hai - Meow Meow!");
    }
}

class Cow extends Animal {  // Cow bhi Animal se inherit kar rahi hai

    Cow(String name) {
        super(name);
    }

    void moo() {
        System.out.println(name + " bol rahi hai - Moo Moo!");
    }
}


// ===========================================================
// 4. MULTIPLE INHERITANCE (Interfaces ke through)
//    Java mein 2 classes se directly inherit NAHI kar sakte
//    Isliye Interfaces use karte hain
// ===========================================================

interface CanSwim {
    void swim();  // Interface mein sirf method ka naam hota hai
}

interface CanFly {
    void fly();
}

// Duck dono interfaces implement kar rahi hai
class Duck implements CanSwim, CanFly {
    String name;

    Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " pani mein tair raha hai!");
    }

    @Override
    public void fly() {
        System.out.println(name + " hawa mein ud raha hai!");
    }

    void quack() {
        System.out.println(name + " bol raha hai - Quack Quack!");
    }
}


// ===========================================================
// 5. HYBRID INHERITANCE (Multiple types ka combination)
//    Yahan Single + Multiple (Interface) dono hai
// ===========================================================

interface CanRun {
    void run();
}

interface CanCarryLoad {
    void carryLoad();
}

// Base class
class HybridAnimal {
    String name;

    HybridAnimal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " khaana kha raha hai!");
    }
}

// Horse - HybridAnimal se inherit kiya + CanRun implement kiya
class Horse extends HybridAnimal implements CanRun {

    Horse(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " bahut tez daud raha hai!");
    }
}

// Donkey - HybridAnimal se inherit kiya + CanCarryLoad implement kiya
class Donkey extends HybridAnimal implements CanCarryLoad {

    Donkey(String name) {
        super(name);
    }

    @Override
    public void carryLoad() {
        System.out.println(name + " bojh utha raha hai!");
    }
}

// Mule - Hybrid: Horse + Donkey dono ki qualities interfaces ke through
class Mule extends HybridAnimal implements CanRun, CanCarryLoad {

    Mule(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " daud sakta hai!");
    }

    @Override
    public void carryLoad() {
        System.out.println(name + " bojh bhi utha sakta hai!");
    }
}


// ===========================================================
//   MAIN CLASS - Sab kuch yahan chalega
// ===========================================================

public class InheritanceTypes {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("  1. SINGLE INHERITANCE");
        System.out.println("========================================");
        Dog dog = new Dog("Tommy");
        dog.eat();       // Animal se mila
        dog.breathe();   // Animal se mila
        dog.bark();      // Dog ka apna method

        System.out.println();
        System.out.println("========================================");
        System.out.println("  2. MULTILEVEL INHERITANCE");
        System.out.println("========================================");
        Puppy puppy = new Puppy("Chhotu");
        puppy.eat();     // Animal se mila (dada ji se!)
        puppy.bark();    // Dog2 se mila (papa se!)
        puppy.weep();    // Puppy ka apna method

        System.out.println();
        System.out.println("========================================");
        System.out.println("  3. HIERARCHICAL INHERITANCE");
        System.out.println("========================================");
        Dog dog2 = new Dog("Bruno");
        Cat cat   = new Cat("Kitty");
        Cow cow   = new Cow("Gauri");

        dog2.eat();   // Animal se mila
        dog2.bark();  // Dog ka method

        cat.eat();    // Animal se mila (same parent!)
        cat.meow();   // Cat ka method

        cow.eat();    // Animal se mila (same parent!)
        cow.moo();    // Cow ka method

        System.out.println();
        System.out.println("========================================");
        System.out.println("  4. MULTIPLE INHERITANCE (Interface)");
        System.out.println("========================================");
        Duck duck = new Duck("Donald");
        duck.swim();    // CanSwim interface se
        duck.fly();     // CanFly interface se
        duck.quack();   // Duck ka apna method

        System.out.println();
        System.out.println("========================================");
        System.out.println("  5. HYBRID INHERITANCE");
        System.out.println("========================================");
        Horse horse = new Horse("Chetak");
        horse.eat();       // HybridAnimal se
        horse.run();       // CanRun se

        Donkey donkey = new Donkey("Gadha Ram");
        donkey.eat();          // HybridAnimal se
        donkey.carryLoad();    // CanCarryLoad se

        Mule mule = new Mule("Kachharu");
        mule.eat();        // HybridAnimal se
        mule.run();        // CanRun se
        mule.carryLoad();  // CanCarryLoad se

        System.out.println();
        System.out.println("========================================");
        System.out.println("  PROGRAM KHATAM - Happy Learning!");
        System.out.println("========================================");
    }
}