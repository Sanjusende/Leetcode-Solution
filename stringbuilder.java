public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for(char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }
        // sb.append(", World!");
        System.out.println(sb.toString()); // Output: Hello, World!
    }
}
