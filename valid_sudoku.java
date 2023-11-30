//Leetcode question 36

class Solution {
    public static boolean isValidSudoku(char[][] board) {
       for(int i=0; i<9; i++){
         for(int j=0; j<9; j++){
            if(board[i][j]!='.'){
                if(!isValidCheck(board,i,j,board[i][j]))
                    return false;
            }
        }
     }
    return true;
  }
    
    static boolean isValidCheck(char[][] board, int row, int col, char ch){
        for(int i=col+1;i<9;i++){
            if(board[row][i] == ch)
                return false;
        }
        for(int i=row+1;i<9;i++){
            if(board[i][col] == ch)
                return false;
        }
        int r1 = row- row % 3;
        int c1 = col -col % 3;
        for(int i = r1; i<r1+3; i++){
            for(int j=c1; j<c1+3; j++){
                if(board[i][j]==ch && !(i==row && j==col))
                    return false;
            }
        }   
    return true;
    }   
}