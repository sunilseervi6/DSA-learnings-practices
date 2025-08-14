//lc 59
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int max = n * n;
        int num = 1;

        int top = 0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;

        while(top <= bottom && left <= right && num <= max){
            for(int i=left ; i<= right ; i++){
                mat[top][i] = num;
                num++;
            }
            top++;
            for(int i=top ; i<=bottom ; i++){
                mat[i][right] = num;
                num++;
            }
            right--;
            if(top <= bottom){
                for(int i=right ; i>=left; i--){
                    mat[bottom][i] = num;
                    num++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom ; i>=top ; i--){
                    mat[i][left]=num;
                    num++;
                }
                left++;
            }
        }
        return mat;



    }
}
