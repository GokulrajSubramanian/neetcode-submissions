class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c: arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0; i<s.length();i++){
            if(map.get(arr[i])==1){
                return i;
            }
        }
        return -1;
    }
}