class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> output = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortVal = new String(arr);
            if(output.containsKey(sortVal)){
               output.get(sortVal).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                output.put(sortVal,list);
            }
        }
        return new ArrayList<>(output.values());
    }
}