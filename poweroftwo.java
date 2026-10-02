import java.util.*;
public class poweroftwo {
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0 ;
    }
    public static int setBit(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){ //if the last bit is 1 then we will count it
                count++;
            }
            n=n>>1; //right shift the bits to check the next bit in the next iteration
        }
        return count;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
    //    System.out.println(isPowerOfTwo(n));
       System.out.println(setBit(n));
    }
}
