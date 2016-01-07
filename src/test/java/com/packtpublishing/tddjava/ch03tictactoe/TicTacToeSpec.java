package com.packtpublishing.tddjava.ch03tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * Created by saravana on 06-01-2016.
 */
public class TicTacToeSpec {
    @Rule
    public ExpectedException exception =
            ExpectedException.none();
    private TicTacToe ticTacToe;

    @Before
    public final void before()
    {
        ticTacToe = new TicTacToe();
    }

    @Test
    public  void whenXoutsideBoardThenRuntimeException()
    {
        exception.expect(RuntimeException.class);
        ticTacToe.play(5, 2);
    }

    @Test
    public void whenYoutsideBoardThenRuntimeException()
    {
        exception.expect(RuntimeException.class);;
        ticTacToe.play(2, 5);
    }

    @Test
    public void whenOccupiedThenRuntimeException()
    {
        ticTacToe.play(2, 1);
        exception.expect(RuntimeException.class);
        ticTacToe.play(2, 1);
    }
}
