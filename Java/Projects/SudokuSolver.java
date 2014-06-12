package Projects;

/* I know the Interface is unnecessary, but I felt like making one
 * to gain a better grasp on how to do it in vim. Also, I do not like scrolling
 * through comments.
 * */
public class SudokuSolver implements ISudokuSolver {

    @Override
    public boolean solvePuzzle(int[][] board){

    }

    @Override
    public int[] inclusion(int[] c, int[] r, int[] s){

    }

    @Override
    public int[] checkSquarePossible(int[][] board, int row, int col){

    }

    @Override
    public int[] checkRowPossible(int[][] board, int row, int col){

    }


    @Override
    public int[] checkColumnPossible(int[][] board, int row, int col){
        boolean[] intArray = {false, false, false, false, false, false, false, false, false, false};
        for(int i=0; i<board[row].length; i++){
            if(board[row][i]>=0){
                intArray[board[row][col]]=true;
            }
        }
        for(int index = 0; i<intArray.length; 

    }
}
