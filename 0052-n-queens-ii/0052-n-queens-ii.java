class Solution {
    public int totalNQueens(int n) {
        return backtrack(0, 0, 0, 0, n);
    } 
    private int backtrack(int row, int cols, int diagonals, int antiDiagonals, int n) {
        if (row == n) return 1;
        int count = 0;
        int availablePositions = ((1 << n) - 1) & ~(cols | diagonals | antiDiagonals);      
        while (availablePositions != 0) {
            int position = availablePositions & -availablePositions;
            availablePositions -= position;           
            count += backtrack(row + 1, 
                cols | position,
                (diagonals | position) << 1,
                (antiDiagonals | position) >> 1,
                n);
        }       
        return count;
    }
}