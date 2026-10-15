
class Solution {
    public int addDigits(int num) {

        // Jab tak number mein 2 ya zyada digits hain
        while (num >= 10) {
            int sum = 0;

            // Number ke har digit ko add karo
            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            // Sum ko naye number ke roop mein use karo
            num = sum;
        }

        return num;
    }
}
