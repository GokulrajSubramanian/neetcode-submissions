class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest =0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int len = 1;
                while(set.contains(current+1)){
                    current++;
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
