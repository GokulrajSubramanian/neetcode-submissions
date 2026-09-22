class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            map.put(b[i],map.getOrDefault(b[i],0)-1);
        }
        for(int val: map.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
