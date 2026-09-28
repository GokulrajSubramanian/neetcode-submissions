class Solution {
    public boolean isPalindrome(String s) {
        String word= s.toLowerCase();
        char[] arr = word.toCharArray();
        int right = arr.length -1;
        int left=0;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(arr[left])){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(arr[right])){
                right--;
            }
            if(arr[left]!=arr[right]){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
