package Projects;

public interface ISudokuSolver {

    /* This method is to go through the column that the square is in
     * and compute the numbers needed to fill that square for the column.
     *
     * ex.
     * -----------------------------------------
     * || X | 9 | X || X | X | X || X | X | X ||
     * || X | . | X || X | X | X || X | X | X ||
     * || X | . | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | 4 | X || X | X | X || X | X | X ||
     * || X | . | X || X | X | X || X | X | X ||
     * || X | 7 | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | . | X || X | X | X || X | X | X ||
     * || X | 1 | X || X | X | X || X | X | X ||
     * || X | . | X || X | X | X || X | X | X ||
     * -----------------------------------------
     *
     * Key:
     * '.' = blank square
     * 'X' = pseudo values
     *
     * This method takes in the whole board and the column in question is
     * column 2. The column contains {1, 4, 7, 9}. The method should return
     * {0, 2, 3, 5, 6, 8}.
     *
     * Method Call: checkColumnPossible(board, 1, 1);
     *      Returns an array: {0, 2, 3, 5, 6, 8}.
     *
     *  */
    public int[] checkColumnPossible(int[][] board, int row, int col);

    /* This method is to go through the row that the square is in and
     * compute the numbers needed to fill that square for the row.
     *
     * ex.
     * -----------------------------------------
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | X | X || X | X | X || X | X | X ||
     * || 3 | . | . || 5 | 9 | 8 || . | . | 1 ||
     * || X | X | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || X | X | X || X | X | X || X | X | X ||
     * || X | X | X || X | X | X || X | X | X ||
     * || X | x | X || X | X | X || X | X | X ||
     * -----------------------------------------
     *
     * Key:
     * '.' = blank square
     * 'X' = pseudo values
     *
     * This takes in the whole board, row, and column of the coordinates of the
     * value that is needed to be found. In the example above, the row in question is
     * 4. The row contains {1, 3, 5, 8, 9}. This method should return {0, 2, 4, 7}.
     *
     * Method Call: checkRowPossible(board, 4, 1);
     *      Return an array: {0, 2, 4, 7}.
     *
     * */
    public int[] checkRowPossible(int[][] board, int row, int col);

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
     *  Lets take the first 3x3 square. It contains the 0, 1, 3, and 4. This means that this
     *  method should return 2,5,6,7,8, and 9 in an array.
     *
     *  Method Call: checkSquarePossible(board, 1, 1);
     *      returns an array: {2, 5, 6, 7, 8, 9}.
     * */
    public int[] checkSquarePossible(int[][] board, int row, int col);

    /* This method is suppose use the arrays returned from checkSquarePossible,
     * checkColumnPossible, and checkRowPossible. Then find the inclusion of the sets
     * and return them as an array.
     *
     * ex.
     * -----------------------------------------
     * || 0 | . | 3 || X | X | X || X | X | X ||
     * || . | 4 | . || 6 | . | 8 || 3 | . | 1 ||
     * || . | 1 | . || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || 8 | X | X || X | X | X || X | X | X ||
     * || . | X | X || X | X | X || X | X | X ||
     * || . | X | X || X | X | X || X | X | X ||
     * ||---------------------------------------
     * || 9 | X | X || X | X | X || X | X | X ||
     * || 7 | X | X || X | X | X || X | X | X ||
     * || 1 | X | X || X | X | X || X | X | X ||
     * -----------------------------------------
     *
     * Key:
     * '.' = blank square
     * 'X' = pseudo values
     *
     * Lets say we wanted know the possible integers that can go in
     * square (1, 0). So we call this method inclusion(checkColumnPossible(board, 1, 0),
     * checkRowPossible(board, 1, 0), checkSquarePossible(board, 1, 0));
     *      checkColumnPossible returns: {2, 3, 4, 5, 6};
     *      checkRowPossible    returns: {0, 2, 5, 7, 9};
     *      checkSquarePossible returns: {2, 5, 6, 7, 8, 9};
     * The intersection of all of arrays will bring about possible numbers to put in the
     * square.
     * */
    public int[] inclusion(int[] c, int[] r, int[] s);

    public boolean solvePuzzle(int[][] board);

}
