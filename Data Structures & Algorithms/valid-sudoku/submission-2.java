class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char value = board[i][j];
                if(value=='.'){
                    continue;
                }
                if(!set.add("row"+i+value) || !set.add("column"+j+value) ||                     !set.add("box"+(i/3)+(j/3)+value)){
                    return false;
                }
            }
        }
        return true;
    }
}
