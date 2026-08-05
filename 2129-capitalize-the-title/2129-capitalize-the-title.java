class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        StringBuilder sb= new StringBuilder();
        int i=0;
        int n=title.length();
        while(i<n){
            int start=i;
            while(i<n && title.charAt(i) != ' '){
                i++;
            }
            int end=i-1;
            int length = end-start+1;
            
            if(length <= 2){
                for(int j=start;j<=end;j++){
                    sb.append(title.charAt(j));
                }
                } else {
                    sb.append(Character.toUpperCase(title.charAt(start)));
                    for(int j=start+1;j<=end;j++){
                        sb.append(title.charAt
                        (j));
                    }
                }
                if(i<n){
                    sb.append(' ');
                    i++;
                }
            }
            return sb.toString();
        }
        
    
}