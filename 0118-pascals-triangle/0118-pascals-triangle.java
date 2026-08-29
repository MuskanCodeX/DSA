class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> row =  new ArrayList<>(Collections.nCopies(i, 1));
            for(int j=1;j<i-1;j++){
                row.set(j, triangle.get(i-2).get(j-1) + triangle.get(i-2).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }
}