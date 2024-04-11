package String;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babab";
        int maxLength =0;
        // odd palindrome
        for (int i = 0; i < s.length(); i++) {
            maxLength = Math.max(traverse(s,i,i),maxLength);
        }
        //even length palindrome
        for (int i = 0; i < s.length(); i++) {
            maxLength = Math.max(traverse(s,i,i+1),maxLength);
        }
        System.out.println(maxLength);
    }

    //this can be converted to dp
    private static int traverse(String s, int left, int right) {
        if(left<0 || right>=s.length()) return 0;
        if(left==right){
            return 1+traverse(s,left-1,right+1);
        }
        if(s.charAt(left) == s.charAt(right)){
            return 2+ traverse(s,left-1,right+1);
        }
        else{
            return Math.max(traverse(s,left-1,right),traverse(s,left,right+1));
        }
    }

}
