public class prodofunction {
    public static int sumofproduct(int a,int b){ // parameter or formal parameter
        int sum= a*b;
        return sum;
    }
    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        int product = sumofproduct(a, b);// argument or actual parameter
        System.out.println("Product of a and b: " + product);
    }
}