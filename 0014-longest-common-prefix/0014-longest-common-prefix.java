import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n= strs.length;
        // Arrays.sort(strs);
        // StringBuilder ans = new StringBuilder();
        // String first = strs[0];
        // String last = strs[n-1];
        // for(int i=0;i<Math.min(first.length() , last.length());i++){
        //     if(first.charAt(i) != last.charAt(i)){
        //         return ans.toString();
        //     }
        //     ans.append(first.charAt(i));
        // }
        // return ans.toString();

        String first = strs[0];
        for(int i=0;i<first.length();i++){
            char ch = first.charAt(i);
            for(int j=1;j<strs.length;j++){
                   if(i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}

