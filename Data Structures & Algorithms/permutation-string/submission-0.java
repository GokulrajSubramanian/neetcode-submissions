class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] arr =new int[26];
        char[] cArr = s1.toCharArray();
        for(char c: cArr){
            arr[c-'a']++;
        }
        int left=0;
        int right = 0;
        int arrNew[] = new int[26];
        while(right<s2.length()){
                boolean check=true;
                arrNew[s2.charAt(right)-'a']++;
                right++;
                if(right-left >(s1.length())){
                    arrNew[s2.charAt(left)-'a']--;
                    left++;
                } else if(right-left <(s1.length())){
                    continue;
                }
                
                for(int i=0; i<26; i++){
                    if(arr[i]!=arrNew[i]){
                        check=false;
                        break;
                    }
                }
                if(check){
                    return true;
                }
        }
        return false;
    }
}
