package dsa.leetcode;

public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String result = longestPalindrome.solution("staamoomau");
        //aaab --> aaa
        //cbbd --> bb
        //staamoomau --> amooma
        //staamofomau --> amofoma
        System.out.println(result);
    }

    public String solution(String s){

        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++){

            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            String currentPalindrome = s.substring(left + 1, right);

            if (currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = currentPalindrome;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            currentPalindrome = s.substring(left + 1, right);

            if (currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = currentPalindrome;
            }

        }

        return longestPalindrome;
    }
}
