class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] temp = nums2;
            nums2=nums1;
            nums1=temp;
        }
        int totalLen = nums1.length+nums2.length;
        int left=0;
        int right=nums1.length;
        while(left<=right){
            int cutA = left+(right-left)/2;
            int cutB = (totalLen+1)/2-cutA;
            int leftMaxA=(cutA ==0)? Integer.MIN_VALUE:nums1[cutA-1];
            int rightMinA=(cutA ==nums1.length)? Integer.MAX_VALUE:nums1[cutA];
            int leftMaxB=(cutB ==0)? Integer.MIN_VALUE:nums2[cutB-1];
            int rightMinB=(cutB ==nums2.length)? Integer.MAX_VALUE:nums2[cutB];
            if(leftMaxA<=rightMinB && leftMaxB<=rightMinA ){
                if(totalLen % 2 ==1){
                    return Math.max(leftMaxA, leftMaxB);
                }
                int leftMax = Math.max(leftMaxA, leftMaxB);
                int rightMin = Math.min(rightMinA, rightMinB);
                return ((double) leftMax+rightMin) /2.0;
            }else if(leftMaxA>rightMinB){
                right = cutA -1;
            }else{
                left = cutA +1;
            }
        }
        throw new IllegalArgumentException("Input not sorted");
    }
}
