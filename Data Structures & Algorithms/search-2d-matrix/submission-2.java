class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int left=0;
        while(left<matrix.length){
            int right= matrix[left].length-1;
            if(target>matrix[left][right]){
                left++;
                continue;
            }else{
                break;
            }
        }
        if(left==matrix.length){
            return false;
        }
        int internalRight = matrix[left].length-1;
        int i=0;
            while(i<=internalRight){
                int mid = i + (internalRight-i)/2;
                if(matrix[left][mid] == target){
                    return true;
                }else if(matrix[left][mid]<target){
                    i=mid+1;
                }else{
                    internalRight = mid-1;
                }
            }
        return false;
    }
}
