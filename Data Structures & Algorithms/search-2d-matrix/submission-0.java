class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;
        int n = matrix.length;
        while(r<n && c>=0){
            if(matrix[r][c] > target){
                c--;
            }else if(matrix[r][c] < target){
                r++;
            }else return true;
        }
        return false;
    }
}
