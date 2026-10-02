public class CallByValueExample {

    // Ye method value ko receive karega (copy of original)
    static void changeValue(int num) {
        // Yaha num ki value change ho rahi hai
        num = num + 10;

        System.out.println("Inside method (num): " + num);
    }

    public static void main(String[] args) {

        int a = 5;

        System.out.println("Before method call (a): " + a);

        // Method call - yaha a ki value pass hogi (copy)
        changeValue(a);

        // Original value change nahi hogi
        System.out.println("After method call (a): " + a);
    }
}