class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            map.putIfAbsent(num,1);
        }
        int len = (nums.length)/2;
        for(Integer key:map.keySet()){
            if(map.get(key)>len){
                return key;
            }
        }
        return 0;
    }
}