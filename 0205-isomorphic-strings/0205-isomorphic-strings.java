class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
         for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (mapST.containsKey(ch1)) {
                if (mapST.get(ch1) != ch2) {
                    return false;
                }
            }else{
                mapST.put(ch1, ch2);
            }
            if (mapTS.containsKey(ch2)){
                if(mapTS.get(ch2) != ch1){
                    return false;
                }
            }else{
                mapTS.put(ch2, ch1);
            }
        }
        return true;
        

        // int n = s.length();
        // int m1[]= new int[256], m2= new int[256];
        // for(int i=0;i<n;i++){
        //     if (m1[s.charAt(i)] != m2[t.charAt(i)]){
        //         return false;
        //     } 
        // m1[s.charAt(i)] = i + 1;
        // m2[t.charAt(i)] = i + 1;
        // }
        // return true;
    }
}