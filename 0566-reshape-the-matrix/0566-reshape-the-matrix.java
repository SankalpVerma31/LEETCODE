class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int k=0;
        int l=0;
        int[][] matrix = new int[r][c];
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                matrix[k][l]=mat[i][j];
                l++;
                if(l%c==0){
                    l=0;
                    k++;
                }
                if(k>=r){
                    return matrix;
                }
            }
        }
        return matrix;
    }
}