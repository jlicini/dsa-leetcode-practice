package dsa.leetcode;

public class IsPalidrome {

    //10 --> 01
    //212 --> 212
    //2112 --> 2112

    public static void main(String[] args) {
        IsPalidrome isPalidrome = new IsPalidrome();
        Boolean result = isPalidrome.solution(121);
        System.out.println(result);
    }

    public boolean solution (int x){

        char[] c = String.valueOf(x).toCharArray();

        for(int i=0; i<c.length/2; i++){
            if(c[i] != c[c.length - 1 -i ]) return false;
        }

        return true;
    }
}
