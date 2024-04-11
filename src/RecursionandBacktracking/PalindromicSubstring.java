package RecursionandBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String s= "aabb";
        int index=0;
        List<String> ans =  new ArrayList<>();
        palindromeSubstring(s,index,new ArrayList<>(),ans);
        for(String p:ans){
            System.out.println(p);
        }
    }

    public static void palindromeSubstring(String s, int index, List<String> res,List<String> ans){
        if(index==s.length()){
            ans.add(res.toString().replace(",",""));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPalindrome(index,i,s)){
                res.add(s.substring(index,i+1));
                palindromeSubstring(s,i+1,res,ans);
                res.remove(res.size()-1);
            }
        }
    }

    public static boolean isPalindrome(int start,int end ,String s){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
