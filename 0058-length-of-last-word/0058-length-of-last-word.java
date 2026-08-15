class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len=s.length();
        if(len==1){
            if(s.charAt(0)==' '){
                return 0;
            }
            else{
                return 1;
            }
        }
        int count=0;
        for(int i =len-1;i>-1;i--){
            if(s.charAt(i)==' '){
                return count;
            }
            else{
                count++;
            }
        }
        return count;
    }
}