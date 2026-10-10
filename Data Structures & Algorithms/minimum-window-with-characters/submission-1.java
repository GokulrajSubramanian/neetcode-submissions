class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length() || s.isEmpty() || t.isEmpty()){
            return "";
        }
        int[] arr = new int[128];
        for(int i=0; i<t.length(); i++){
            arr[t.charAt(i)]++;
        }
        int left=0;
        int right=0;
        int notedLeft=0;
        int minWindow=Integer.MAX_VALUE;
        int[] arrNew = new int[128];
        while(right<s.length()){
            arrNew[s.charAt(right)]++;
            boolean isValid=validityCheck(arrNew, arr);
            if(!isValid){
                right++;
            }else{
                while(isValid){
                    int length=right-left+1;
                    if (length < minWindow) {
                        minWindow = length;
                        notedLeft = left;
                    }
                    arrNew[s.charAt(left)]--;
                    left++;
                    isValid=validityCheck(arrNew, arr);
                }
                right++;
            }
        }
        if(minWindow==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(notedLeft, notedLeft + minWindow);
    }
    public boolean validityCheck(int[] arrNew, int[] arr){
        for(int i=0; i<128; i++){
                if(arrNew[i]<arr[i]){
                    return false;
                }
            }
        return true;
    }
}
