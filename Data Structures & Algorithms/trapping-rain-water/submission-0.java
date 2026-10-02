class Solution {
    public int trap(int[] height) {
        
        int left=0;
        int right = height.length-1;
        int maxRight=0;
        int maxLeft=0;
        int trap=0;
        while(left<right){
            if(height[left]<height[right]){
                maxLeft= Math.max(maxLeft, height[left]);
                int water= maxLeft - height[left];
                trap += water;
                left++;
            }
            else{
                maxRight= Math.max(maxRight, height[right]);
                int water= maxRight - height[right];
                trap += water;
                right--;
            }
        }
        return trap;
    }
}
