package com.packtpublishing.tddjava.ch03tictactoe;

/**
 * Created by saravana on 06-01-2016.
 */
public class TicTacToe {
    private Character[][] board = {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};

    public void play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        setBox(x, y);
    }

    private void checkAxis(int axis)
    {
        if(axis < 1 || axis > 3)
        {
            {
                throw new RuntimeException("X is outside Board");
            }
        }
    }

    private void setBox(int x, int y)
    {
        if(board[x-1][y-1] != '\0')
        {
            throw new RuntimeException("Box i occupied");
        }
        else
        {
            board[x-1][y-1] = 'X';
        }
    }

}
