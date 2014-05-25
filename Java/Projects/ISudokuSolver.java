public interface ISudokuSolver {

    /* This method is to go through the column that the square is in
     * and compute the numbers needed to fill that square for the column.
     *
     * ex.
     * -----------------------------------------
     * || 0 | . | 3 || X | X | X || X | X | X ||
     * || . | 4 | . || X | X | X || X | X | X ||
     * || . | 1 | . || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * -----------------------------------------
     *
     * Key:
     * '.' = blank square
     * 'X' = pseudo values
     *
     *  */
    private int[] checkColumnPossible(int[][] board, int row, int col);

    /* This method is to go through the row that the square is in and
     * compute the numbers needed to fill that square for the row.
     *
     * ex.
     * -----------------------------------------
     * || X | . | X || X | X | X || X | X | X ||
     * || X | 4 | X || X | X | X || X | X | X ||
     * || X | 1 | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | 7 | X || X | X | X || X | X | X ||
     * || X | . | X || X | X | X || X | X | X ||
     * || X | 9 | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | . | X || X | X | X || X | X | X ||
     * || X | . | X || X | X | X || X | X | X ||
     * || X | 0 | X || X | X | X || X | X | X ||
     * -----------------------------------------
     *
     * Key:
     * '.' = blank square
     * 'X' = pseudo values
     *
     *
     * */
    private int[] checkRowPossible(int[][] board, int row, int col);

    /* This method is to go through the 3x3 square that the square is in
     * and compute the numbers needed to fill that blank square for the
     * 3x3 square. (Complex I know)
     *
     * ex.
     * -----------------------------------------
     * || 0 | . | 3 || X | X | X || X | X | X ||
     * || . | 4 | . || X | X | X || X | X | X ||
     * || . | 1 | . || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * -----------------------------------------
     *
     * Key:
     * '.' = blank square
     * 'X' = pseudo values
     *
     *  Lets take the first square. It contains the 0, 1, 3, and 4. This means that this
     *  method should return 2,5,6,7,8, and 9 in an array.
     *
     *  Method Call: checkSquarePossible(board, 1, 1);
     *      returns an array; {2, 5, 6, 7, 8, 9};
     * */
    private int[] checkSquarePossible(int[][] board, int row, int col);

    private int[] inclusion(int[] c, int[] r; int[] s);

}
