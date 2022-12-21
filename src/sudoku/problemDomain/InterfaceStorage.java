package sudoku.problemDomain;

import java.io.IOException;

public interface InterfaceStorage {
    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
}
