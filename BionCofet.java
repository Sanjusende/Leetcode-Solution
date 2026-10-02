import java.util.*;
public class BionCofet{
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
   public int bionomial(int n,int r){
        int factn=factorial(n);
        int factr=factorial(r);
        int factnr=factorial(n-r);
        int bionomial=factn/(factr*factnr);
        return bionomial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        BionCofet obj=new BionCofet();
        int result=obj.bionomial(n, r);
        System.out.println("Bionomial of n and r is :"+result);

    }
}