class Solution {
    public String longestPalindrome(String s) {

        // Agar string empty ya single character hai
        if (s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        // Har character ko center maanenge
        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            // Example: "aba"
            int len1 = expandFromCenter(s, i, i);

            // Even length palindrome
            // Example: "abba"
            int len2 = expandFromCenter(s, i, i + 1);

            // Dono me se longest length
            int len = Math.max(len1, len2);

            // Agar naya palindrome current answer se bada hai
            if (len > end - start + 1) {

                // Starting index calculate karo
                start = i - (len - 1) / 2;

                // Ending index calculate karo
                end = i + len / 2;
            }
        }

        // start se end tak substring return karo
        return s.substring(start, end + 1);
    }

    // Center se left aur right dono taraf expand karega
    private int expandFromCenter(String s, int left, int right) {

        // Jab tak boundaries ke andar hain
        // aur dono characters same hain
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        // Loop ke baad left/right ek step extra chale gaye hain
        // Isliye actual palindrome length:
        return right - left - 1;
    }
}