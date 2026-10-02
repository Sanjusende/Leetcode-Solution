public class palindrome {
    public static void main(String[] args) {
        int pal = 121;
        int rev = 0;
        int temp = pal;
        
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        
    }
}
