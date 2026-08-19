class Solution {
    public String reverseWords(String s) {
        // s = s.trim();
        // String[] words = s.split("\\s+");
        // StringBuilder ans =  new StringBuilder();
        // for(int i=words.length-1;i>=0;i--){
        //     if(i==0){
        //         ans.append(words[i]);
        //     }else{
        //     ans.append(words[i]).append(" ");
        //     }
        // }
        // return ans.toString();

        char[] arr = s.toCharArray();
        int n= arr.length;
        int idx = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != ' '){
                if(idx != 0){
                    arr[idx++] = ' ';
                }
                while(i<n && arr[i] != ' '){
                    arr[idx++] = arr[i++];
                }
            }
        }
        reverse(arr, 0, idx-1);
        int start = 0;
        for(int i=0;i<=idx;i++){
            if(i == idx || arr[i] == ' '){
                reverse(arr, start , i-1);
                start = i+1;
            }
        }
        return new String(arr, 0, idx);
    }
    private void reverse(char[] arr, int start , int end){
        while(start<end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}