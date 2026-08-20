class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        //-----------BRUTE FORCE----------
        // for(int i=0;i<s.length();i++){
        //     String rotated = s.substring(i) + s.substring(0,i);
        //     if(s.equals(goal)){
        //         return true;
        //     }
        // }
        // return false;


        //-----------OPTIMAL------------
        String ans= s.concat(s);
        return ans.contains(goal);
    }
}