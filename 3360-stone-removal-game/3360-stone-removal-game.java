class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int i =0;
        while(n>=10-i){
            n=n-(10-i);
            i++;
        }
        if(i%2==0){
            return false;
        }
        return true;
    }
}