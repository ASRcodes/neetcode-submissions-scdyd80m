class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char ch = board[i][j];
                if(ch=='.'){
                    continue;
                }

                String row = "r"+i+"-"+ch;
                String col = "c"+j+"-"+ch;
                String box = "b"+((i/3)*3+(j/3))+"-"+ch;
                
                if(!set.add(row)) return false;
                if(!set.add(col)) return false;
                if(!set.add(box)) return false;
            }
        }
        return true;
    }
}
