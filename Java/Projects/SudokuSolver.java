package Projects;

import java.util.List;
import java.util.ArrayList;

/* I know the Interface is unnecessary, but I felt like making one
 * to gain a better grasp on how to do it in vim. Also, I do not like scrolling
 * through comments.
 * */
public class SudokuSolver implements ISudokuSolver {

    @Override
    public boolean solvePuzzle(int[][] board){
        return false;
    }

    @Override
    public List<Integer> inclusion(boolean[] c, boolean[] r, boolean[] s){
        return null;
    }

    @Override
    public boolean[] checkSquarePossible(int[][] board, int row, int col){
        boolean[] intArray = new boolean[10];
        for(int i = row -(row%3); i< (row-(row%3)+3); i++) {
            for(int j = col - (col%3); j < (col -(col%3)+3); j++) {
                if(board[i][j] >= 0)
                    intArray[board[i][j]]=true;
            }
        }
        return intArray;
    }

    @Override
    public boolean[] checkRowPossible(int[][] board, int row, int col){
        boolean[] intArray = new boolean[10];
        for(int i=0; i<board.length; i++){
            if(board[row][i]>=0)
                intArray[board[row][i]]=true;
        }
        return intArray;
    }

    @Override
    public boolean[] checkColumnPossible(int[][] board, int row, int col){
        boolean[] intArray = new boolean[10];
        for(int i=0; i<board[row].length; i++){
            if(board[i][col]>=0)
                intArray[board[i][col]]=true;
        }
        return intArray;
    }
}
