import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class Test1{

    int[][] board = {{0,-1, 4, -3, 5, -6, -1, 8, 9, -1},
                      {0,-1, 4, -3, 5, -6, -1, 8, 9, -1},
                      {0,-1, 4, -3, 5, -6, -1, 8, 9, -1},
                      {0,-1, 4, -3, 5, -6, -1, 8, 9, -1},
                      {0,-1, 4, -3, 5, -6, -1, 8, 9, -1},
                      {0,-1, 4, -3, 5, -6, -1, 8, 9, -1},
                      {0,-1, 4, -3, 5, -6, -1, 8, 9, -1},
                      {0,-1, 4, -3, 5, -6, -1, 8, 9, -1},
                      {0,-1, 4, -3, 5, -6, -1, 8, 9, -1}};
    @Test
    public void Test(){
        SudokuSolver solve = new SudokuSolver();
        boolean[] arr = solve.checkRowPossible(board, 0, 1);
        assertFalse(arr[0]);
    }
}
