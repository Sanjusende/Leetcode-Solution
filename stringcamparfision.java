public class stringcamparfision {
    public static boolean areStringsEqual(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }
    public static void substring(String str, int start, int end) {
        String substr = str.substring(start, end);
        System.out.println(substr);
    }
    public static void main(String[] args) {
        // System.out.println(areStringsEqual("hello", "hello")); // true
        // System.out.println(areStringsEqual("hello", "world")); // false
        String str = "Hello, World!";
        substring(str, 0, 9); // Output: Hello

    }
}
