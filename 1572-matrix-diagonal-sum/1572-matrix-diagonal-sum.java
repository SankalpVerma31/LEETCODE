class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int k =0;
        for(int i =0;i<mat.length;i++){
            if(i==mat.length-i-1){
                sum=sum+mat[i][i];
                continue;
            }
            sum=sum+mat[i][mat.length-i-1]+mat[i][i];
        }
        return sum;
    }
}