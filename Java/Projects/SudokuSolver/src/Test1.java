import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class Test1{

    //Easy Sudoku Puzzle
    int[][] board1 = {{ 7, 9,-1,-1,-1,-1, 3,-1,-1},
                      {-1,-1,-1,-1,-1, 6, 9,-1,-1},
                      { 8,-1,-1,-1, 3,-1,-1, 7, 6},
                      {-1,-1,-1,-1,-1, 5,-1,-1, 2},
                      {-1,-1, 5, 4, 1, 8, 7,-1,-1},
                      { 4,-1,-1, 7,-1,-1,-1,-1,-1},
                      { 6, 1,-1,-1, 9,-1,-1,-1, 8},
                      {-1,-1, 2, 3,-1,-1,-1,-1,-1},
                      {-1,-1, 9,-1,-1,-1,-1, 5, 4}};

    int[][] sboard1 = {{ 7, 9, 6, 8, 5, 4, 3, 2, 1},
                       { 2, 4, 3, 1, 7, 6, 9, 8, 5},
                       { 8, 5, 1, 2, 3, 9, 4, 7, 6},
                       { 1, 3, 7, 9, 6, 5, 8, 4, 2},
                       { 9, 2, 5, 4, 1, 8, 7, 6, 3},
                       { 4, 6, 8, 7, 2, 3, 5, 1, 9},
                       { 6, 1, 4, 5, 9, 7, 2, 3, 8},
                       { 5, 8, 2, 3, 4, 1, 6, 9, 7},
                       { 3, 7, 9, 6, 8, 2, 1, 5, 4}};
    @Test
    public void checkRowPossibleTestforRowZeroEasy(){
        SudokuSolver solve = new SudokuSolver();
        boolean[] arr = solve.checkRowPossible(board1, 0, 2);
        assertFalse(arr[0]);
        assertFalse(arr[1]);
        assertFalse(arr[2]);
        assertTrue(arr[3]);
        assertFalse(arr[4]);
        assertFalse(arr[5]);
        assertFalse(arr[6]);
        assertTrue(arr[7]);
        assertFalse(arr[8]);
        assertTrue(arr[9]);
    }

    @Test
    public void checkInclusionforEasy(){
        SudokuSolver solve = new SudokuSolver();
        List<Integer> possible = solve.inclusion(
                solve.checkRowPossible(board1,0,2), solve.checkColumnPossible(board1,0,2),
                solve.checkSquarePossible(board1,0,2));
        System.out.println();
        for(Integer i: possible)
            System.out.println(i);
    }
}
