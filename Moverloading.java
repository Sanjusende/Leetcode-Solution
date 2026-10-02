public class Moverloading {

    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){   //this is method overloading 
                                         // same function but defferent parametter
        return a+b+c;
    }

    public static void main(String[] args) {
        Moverloading obj=new Moverloading();
       int result=obj.sum(10, 50);
       int result2=obj.sum(10, 50, 30);
        System.out.println("result one is:"+result);
        System.out.println("result two is:"+result2);
    }
}
