class Solution {
    public int minRotations(String s) {
        //-------brute force---------
        int rot = 0;
        int curr = 0;
        for(int i=0;i<s.length();i++){
            int target = s.charAt(i) - '0';
            int clockwise = 0;
            int temp = curr;
            while(temp != target){
                temp = (temp + 1)% 10;
                clockwise++;
            }

            int anticlock = 0;
            temp = curr;
            while(temp != target){
                temp = (temp -1 + 10)% 10;
                anticlock++;
            }
            rot += Math.min(clockwise , anticlock);
            curr = target;
        }
        return rot;

        //------approach 2----------
        // int curr = 0;
        // int total = 0;
        // for(int i=0;i<s.length();i++){
        //     int target = s.charAt(i) - '0';
        //     int diff = Math.abs(curr - target);
        //     int rot = Math.min(diff, 10-diff);
        //     total += rot;
        //     curr = target;
        // }
        // return total;

        //--------approach 3----------
        
    }

}