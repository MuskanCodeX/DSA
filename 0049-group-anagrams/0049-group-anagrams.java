import java.util.Arrays;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        // for(String str: strs){
        //     char[] Chars= str.toCharArray();
        //     Arrays.sort(Chars);
        //     String key= new String(Chars);
        //     if(!map.containsKey(key)){
        //         map.put(key, new ArrayList<>());
        //     }
        //     map.get(key).add(str);
        // }
        // return new ArrayList<>(map.values());

        
        for(String str : strs) {
            int[] count = new int[26];
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append("#").append(count[i]);
            }
            if(!map.containsKey(key.toString())) {
                map.put(key.toString(), new ArrayList<>());
            }
            map.get(key.toString()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}