public class printsum {
    public static void printsum1(int i,int n,int sum){
      if(i==n){
       sum+=i;
       System.out.println(sum);
       return;
      }  
      sum+=i;
      printsum1(i+1, n, sum);
      System.out.println(i);
    }
    public static void main(String[] args){
       printsum1(1, 5, 0);
    }
}
