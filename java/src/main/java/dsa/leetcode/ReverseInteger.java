package dsa.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.solution(333333333);
        System.out.println(result);
    }

    public int solution(int x){
        char[] characters = String.valueOf(x).toCharArray();
        StringBuilder s = new StringBuilder();

        boolean isNegative = characters[0] == '-';

        if (isNegative) {
            s.append('-');
        }


        int i = characters.length-1;
        while (i >= (isNegative ? 1 : 0)) {
            s.append(characters[i]);
            i--;
        }

        long reversedNumber = Long.parseLong(s.toString());

        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversedNumber;
    }
}
