class Solution {
    public List<Integer> getRow(int rowIndex) {
        // List<List<Integer>> ans = new ArrayList<>();
        // for(int i=0;i<=rowIndex;i++){
        //     List<Integer> list = new ArrayList<>(Collections.nCopies(i+1,1));
        //     for(int j=1;j<i;j++){
        //         list.set(j, ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
        //     }
        //     ans.add(list);
        // }
        // return ans.get(rowIndex); 

        //-----approach 2--------
        // List<Integer> ans = new ArrayList<>();
        // ans.add(1);
        // for(int i=1;i<=rowIndex;i++){
        //     ans.add(1);
        //     for(int j=i-1;j>0;j--){
        //         ans.set(j, ans.get(j-1) + ans.get(j));
        //     }
        // }
        // return ans;

        //-------approach 3----------
        List<Integer> ans = new ArrayList<>();
        long value = 1;
        for(int i=0;i<=rowIndex;i++){
            ans.add((int)value);
            value = value * (rowIndex-i)/(i+1);
        }
        return ans;
    }
}