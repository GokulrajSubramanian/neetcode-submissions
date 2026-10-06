class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left =0;
        int right =0;
        int count=0;
        int max=0;
        Set<Character> set = new HashSet<>();
        while(right<s.length()){
            if(set.add(s.charAt(right))){
                int len =right-left+1;
                max= Math.max(max, len);
                right++;
            }else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }  
        }
        return max;
    }
}
