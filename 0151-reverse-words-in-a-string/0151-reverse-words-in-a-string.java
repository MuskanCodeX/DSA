class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder ans =  new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            if(i==0){
                ans.append(words[i]);
            }else{
            ans.append(words[i]).append(" ");
            }
        }
        return ans.toString();
    }
}