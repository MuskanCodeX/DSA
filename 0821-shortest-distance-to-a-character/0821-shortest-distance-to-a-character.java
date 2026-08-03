class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int left=0;
        int right=n-1;
        int leftprev=-n;
        int rightprev=2*n;;
        int answer[]=new int[n];

        for(int i=0;i<=right;i++){
            if(s.charAt(i)==c){
                leftprev=i;
            }
                answer[i]=i-leftprev;
        }

        for(int i=right;i>=0;i--){
            if(s.charAt(i)==c){
                rightprev=i;
            }
            answer[i]=Math.min(answer[i],rightprev-i);
        }
        return answer;

    }
}