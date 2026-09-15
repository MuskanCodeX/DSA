class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        //-------using hashmap-----------
        // for(int i=0;i<n;i++){
        //     HashMap<Character,Integer> map = new HashMap<>();
        //     for(int j=i;j<n;j++){
        //         map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0) +1);
        //         int maxi =  Integer.MIN_VALUE;
        //         int mini = Integer.MAX_VALUE;
        //         for(int val : map.values()){
        //             mini = Math.min(mini, val);
        //             maxi = Math.max(maxi, val);
        //         }
        //         sum += (maxi-mini);
        //     }
        // }

        //-------using array----------
        for(int i=0;i<n;i++){
            int freq[] = new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j) - 'a']++;
                int maxi = 0;
                int mini = Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k] > 0){
                        maxi = Math.max(maxi, freq[k]);
                        mini = Math.min(mini, freq[k]);
                    }
                }
                sum += maxi - mini;
            }
        }
        return sum;
    }
}