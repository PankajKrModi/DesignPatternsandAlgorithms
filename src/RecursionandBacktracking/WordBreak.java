package RecursionandBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        List<String> a= Arrays.asList( "i", "like", "sam", "sung", "samsung", "mobile", "ice",
                "and", "cream", "icecream", "man", "go", "mango");
        String s = "ilikesamsungmobile";
        List<String> ans = new ArrayList<>();
        solve(s,a,0,new ArrayList<>(),ans);
        for(String s1:ans){
            System.out.println(s1);
        }
    }

    public static void solve(String s, List<String> a, int index, List<String> res,List<String> ans){
        if(index==s.length()){
            ans.add(res.toString().replace(","," "));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(presentInDict(a,s.substring(index,i+1))){
                res.add(s.substring(index,i+1));
                solve(s,a,i+1,res,ans);
                res.remove(res.size()-1);
            }
        }
    }

    private static boolean presentInDict(List<String> a, String substring) {
        for(String s:a){
            if(s.equalsIgnoreCase(substring))
                return true;
        }
        return false;
    }
}
