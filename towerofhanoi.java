public class towerofhanoi {

    public static void toweroFhanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Move " + source + " to " + destination);
            return;
        }
        
        toweroFhanoi(n-1, source,  destination,helper);
        System.out.println("move"+ source + "destination"+destination);
        toweroFhanoi(n-1, helper,source, destination);
    }

    public static void main(String[] args) {
        toweroFhanoi(3, "S", "H","D"); 
         
    }
}