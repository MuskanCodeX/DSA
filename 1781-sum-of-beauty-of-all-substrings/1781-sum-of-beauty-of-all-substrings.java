class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i;j<n;j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0) +1);
                int maxi =  Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;
                for(int val : map.values()){
                    mini = Math.min(mini, val);
                    maxi = Math.max(maxi, val);
                }
                sum += (maxi-mini);
            }
        }
        return sum;
    }
}