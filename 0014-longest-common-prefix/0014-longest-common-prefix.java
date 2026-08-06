class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] max=strs[0].toCharArray();
        int len =strs.length;
        for(int i=1;i<len;i++){
            char[] current =strs[i].toCharArray();
            int len1=max.length;
            int len2=current.length;
            int j=0;
            for( j=0;j<Math.min(len1,len2);j++){
                if(max[j]==current[j]){
                    continue;
                }
                else{
                    break;
                }
            }
            max = Arrays.copyOf(max, j);
        } 
        return new String(max);
    }
}