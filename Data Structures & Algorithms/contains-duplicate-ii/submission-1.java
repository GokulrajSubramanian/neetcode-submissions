class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int val1=map.get(nums[i]);
                if(Math.abs(val1-i)<= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}