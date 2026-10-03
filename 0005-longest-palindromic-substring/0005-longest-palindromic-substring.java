class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1){
            return s;
        }
        //----------brute force approach---------
    //     String ans = " ";
    //     for(int i=0;i<n;i++){
    //         for(int j=i;j<n;j++){
    //             String sub = s.substring(i,j+1);
    //             if(isPalindrome(sub)){
    //                 if(sub.length() > ans.length()){
    //                     ans = sub;
    //                 }
    //             }
    //         }
    //     }
    //     return ans;
    // }
    // public boolean isPalindrome(String s){
    //     int start = 0;
    //     int end = s.length()-1;
    //     while(start < end){
    //         if(s.charAt(start) != s.charAt(end)){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }

    //----------expand around center----------
    int start = 0;
    int maxLength = 1;
    for(int i=0;i<n;i++){
        int len1 = expand(s, i, i);
        int len2 = expand(s, i, i+1);
        int len = Math.max(len1, len2);
        if(len > maxLength){
            maxLength = len;
            start = i-(len-1)/2;
        }
    }
    return s.substring(start, start+maxLength);
    }
    public int expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}