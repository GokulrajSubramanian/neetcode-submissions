class Solution {
    public boolean hasDuplicate(int[] nums) {
         Hashtable<Integer, Integer> table = new Hashtable<>();
         for(int n:nums){
            if(table.containsKey(n)==false){
                table.put(n,1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}