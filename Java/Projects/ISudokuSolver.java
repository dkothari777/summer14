public interface ISudokuSolver {


    public int[] checkColumnPossible(int[][] board, int row, int col);
    public int[] checkRowPossible(int[][] board, int row, int col);
    public int[] checkSquarePossible(int[][] board, int row, int col);
    public int[] inclusion(int[] c, int[] r; int[] s);

}
