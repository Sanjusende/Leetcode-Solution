import java.util.*;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please entwer the subject marks:");
        int marks[] = new int[100];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("the percentage is:" + percentage);
    }
}
