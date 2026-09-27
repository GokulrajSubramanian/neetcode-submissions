class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str.length()+"#"+str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+len+1);
            res.add(word);
            i=j+len+1;
        }
        
        
        return res;
    }
}
