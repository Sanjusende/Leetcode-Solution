public class printIncressing {
    public static void printIncressing(int n) {

        if (n == 1) {

            System.out.println(n + " ");
            return;
        }
        printIncressing(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printIncressing(n);

    }
}
