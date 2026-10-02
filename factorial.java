public class factorial {
    public static int calfact(int n) {
        if (n == 1 || n == 0) { // BASE CASE
            return 1;
        }

        int fmn = calfact(n - 1);
        int sum = n * fmn;
        return sum;
    }

    public static void main(String[] args) {
        int result = calfact(5);
        System.out.println("factorial of 5 :" + result);
    }
}
