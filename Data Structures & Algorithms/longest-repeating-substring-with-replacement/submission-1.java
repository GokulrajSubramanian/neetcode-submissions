class Solution {
    public int characterReplacement(String s, int k) {
        
        int left=0;
        int max=0;
        int windowMax=0;
        int[] arr = new int[26];
        int right=0;
        while(right<s.length()){
            arr[s.charAt(right)-'A']++;
            max= Integer.max(max,arr[s.charAt(right)-'A'] );
            int window = right-left+1;
            if((window-max)<=k){
                windowMax = Integer.max(windowMax, window);
                right++;
            }else if((window-max)>k){ 
                arr[s.charAt(left)-'A']--;
                left++;
                right++;
            }
        }
        return windowMax;
    }
}
