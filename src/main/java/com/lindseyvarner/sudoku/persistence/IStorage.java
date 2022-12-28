package com.lindseyvarner.sudoku.persistence;

import com.lindseyvarner.sudoku.logic.SudokuGame;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
}
