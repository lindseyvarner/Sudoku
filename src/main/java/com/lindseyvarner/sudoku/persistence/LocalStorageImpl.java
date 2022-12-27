package com.lindseyvarner.sudoku.persistence;

import com.lindseyvarner.sudoku.problemDomain.IStorage;
import com.lindseyvarner.sudoku.problemDomain.SudokuGame;

import java.io.*;

public class LocalStorageImpl implements IStorage {
    private SudokuGame game;

    @Override
    public void updateGameData(SudokuGame game) throws IOException {
       this.game = game;
    }

    @Override
    public SudokuGame getGameData() throws IOException {
        if (this.game == null) {
            throw new IOException();
        }
        return this.game;
    }
}
