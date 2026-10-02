public class recursion{
    public static void run(int n){
        if(n==6){   //BASE CASE
            return;
        }
        System.out.print(n+" ");
        run(n+1); // recursion
    }
    public static void main(String[] args) {
        int n=1;
        run(n); //call function

    }
}