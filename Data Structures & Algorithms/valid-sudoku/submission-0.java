class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char ch = board[r][c];
                if(ch=='.') continue;

                String checkRow = "r"+r+"-"+ch; 
                String checkCol = "c"+c+"-"+ch;
                String checkbox = "b"+ ((r/3)*3+(c/3))+"-"+ch;

                if(!seen.add(checkRow)) return false;
                if(!seen.add(checkCol)) return false;
                if(!seen.add(checkbox)) return false; 
            }
        }
        return true;
    }
}
