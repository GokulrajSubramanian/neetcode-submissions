class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<nums1.length;i++){
            seen.add(nums1[i]);
        }
        Set<Integer> arr = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        List<Integer> fin = new ArrayList<>();
        for(int num: seen){
            if(arr.contains(num)){
                fin.add(num);
            }
        }
        return fin.stream().mapToInt(Integer::intValue).toArray();
    }
}