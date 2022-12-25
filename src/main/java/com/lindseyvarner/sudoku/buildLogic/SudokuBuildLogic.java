package com.lindseyvarner.sudoku.buildLogic;

import com.lindseyvarner.sudoku.computationLogic.GameLogic;
import com.lindseyvarner.sudoku.persistence.LocalStorageImpl;
import com.lindseyvarner.sudoku.problemDomain.IStorage;
import com.lindseyvarner.sudoku.problemDomain.SudokuGame;
import com.lindseyvarner.sudoku.userInterface.IUserInterfaceContract;
import com.lindseyvarner.sudoku.userInterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try {
            initialState = storage.getGameData();
        } catch (IOException e) {
            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);
        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
