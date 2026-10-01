class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> list = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                list.set(j, ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            ans.add(list);
        }
        return ans.get(rowIndex); 
    }
}