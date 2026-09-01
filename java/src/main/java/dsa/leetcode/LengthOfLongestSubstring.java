package dsa.leetcode;

import java.util.*;

public class LengthOfLongestSubstring {


    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int result = lengthOfLongestSubstring.solution("1R1T7");
        //dvdf
        //abcaa
        System.out.println(result);
    }

    public int solution(String s) {

        Set<Character> characters = new HashSet<>();

        int maxLen=0;
        int left=0;

        for(int i=0; i<s.length(); i++){

            char character = s.charAt(i);

            while (characters.contains(character)) {
                characters.remove(s.charAt(left));
                left++;
            }

            characters.add(character);
            maxLen = Math.max(maxLen, i - left + 1);
        }


        return maxLen;
    }
}
