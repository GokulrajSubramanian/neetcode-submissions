class Solution {
    public boolean isValid(String s) {
        
        char[] arr= s.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        for(char val : arr){
            if(val=='(' || val=='{' || val=='['){
                deque.push(val);
            }else{
                if(deque.isEmpty()){
                    return false;
                }
                if(val==')'&& deque.peek()=='('){
                    deque.pop();
                }
                else if(val=='}'&& deque.peek()=='{'){
                    deque.pop();
                }
                else if(val==']'&& deque.peek()=='['){
                    deque.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(deque.isEmpty()){
            return true;
        }
        return false;
    }
}
