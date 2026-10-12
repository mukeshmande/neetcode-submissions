class Solution {
    public boolean isValidSudoku(char[][] board) {
     Map<Integer, HashSet<Character>> rows = new HashMap<>();
     Map<Integer, HashSet<Character>> cols = new HashMap<>();
     Map<String, HashSet<Character>> squares = new HashMap<>();
     for(int row=0; row<9; row++){
        for(int col = 0; col<9; col++){
            if(board[row][col] == '.') continue;
            String square = (row/3)+","+(col/3);
            if(rows.computeIfAbsent(row, k -> new HashSet<Character>()).contains(board[row][col]) ||
            cols.computeIfAbsent(col, k -> new HashSet<Character>()).contains(board[row][col]) ||
            squares.computeIfAbsent(square, k -> new HashSet<Character>()).contains(board[row][col])){
                return false;
            }
            rows.get(row).add(board[row][col]);
            cols.get(col).add(board[row][col]);
            squares.get(square).add(board[row][col]);
        }
     }


    return true;
    }
}
