class Solution {
    public void solve (char[][] board, int row, List<List<String>> solutions){
        if (row == board.length){
            solutions.add(saveboard(board));
            return;
        }

        for (int col =0; col<board.length; col++){
            if (issafe(board,row,col)){
                board[row][col] = 'Q';
                solve(board,row+1,solutions);
                board[row][col] ='.';
            }
        }
    }

    public List<String> saveboard(char[][] board){
        List<String> currentboard = new ArrayList<>();
        for (int i =0; i<board.length; i++){
            currentboard.add(new String(board[i]));
        }
        return currentboard;
    }

    public static boolean issafe(char[][] board,int row, int col){
        for (int i=0; i<row; i++){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        for (int i =row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        for (int  i= row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        solve (board,0,solutions);

        return solutions;
        
    }
}