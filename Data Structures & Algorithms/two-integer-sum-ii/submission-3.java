class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int len= numbers.length;
        int right= len-1;
        int left=0;
        while(left<right){
            int sum =numbers[left]+ numbers[right];
            if(sum==target){
                    return new int[]{left+1,right+1};
            }
            if(sum> target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
    }
}
