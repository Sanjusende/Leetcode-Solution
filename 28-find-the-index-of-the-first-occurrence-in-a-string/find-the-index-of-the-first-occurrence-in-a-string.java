class Solution {
    public int strStr(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        for (int i = 0; i <= m - n; i++) {

            int j;

            for (j = 0; j < n; j++) {

                // Current characters match nahi hue
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }

            // Puri s2 match ho gayi
            if (j == n) {
                return i;
            }
        }

        return -1;
    }
}