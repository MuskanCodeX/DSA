import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        //---------BRUTE FORCE--------
        // char[] s1= s.toCharArray();
        // char[] t1 = s.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(t1);
        // return Arrays.equals(s1,t1);

        //--------BETTER----------
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(char ch: s.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch,0)+1);
        // }
        // for(char ch: t.toCharArray()){
        //     if(!map.containsKey(ch)){
        //         return false;
        //     }
        //     map.put(ch, map.get(ch)-1);
        //     if(map.get(ch)<0){
        //         return false;
        //     }
        // }
        // return true;

        //---------OPTIMAL--------
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)- 'a']++;
            count[t.charAt(i)- 'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}