class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] values:accounts){
            int temp=0;
            int i=0;
            for(int element:values){
                temp=temp+element;
                i++;
            }
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }
}