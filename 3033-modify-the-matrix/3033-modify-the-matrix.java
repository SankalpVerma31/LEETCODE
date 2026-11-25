class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] newmat= new int[matrix.length][matrix[0].length];
        int[] max = new int[matrix[0].length];
        for(int j=0;j<matrix[0].length;j++){
            max[j]=0;
            for(int i=0;i<matrix.length;i++){
                newmat[i][j]=matrix[i][j];
                if(max[j]<matrix[i][j]){
                    max[j]=matrix[i][j];
                }
            }
        }
        for(int j=0;j<matrix[0].length;j++){
            for(int i=0;i<matrix.length;i++){
                if(newmat[i][j]==-1){
                    newmat[i][j]=max[j];
                }
            }
        }
        return newmat;
    }
}