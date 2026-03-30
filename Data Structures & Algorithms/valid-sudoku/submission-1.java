class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                char ch = board[r][c];
                if(ch == '.') continue;

                String checkrow = "r"+r+"-"+ch;
                String checkcol = "c"+c+"-"+ch;
                String checkbox = "b"+((r/3)*3+(c/3))+"-"+ch;

                if(!seen.add(checkrow)) return false;
                if(!seen.add(checkcol)) return false;
                if(!seen.add(checkbox)) return false;
            }
        }
        return true;
    }
}
