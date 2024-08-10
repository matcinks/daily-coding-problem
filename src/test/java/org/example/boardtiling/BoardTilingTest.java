package org.example.boardtiling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTilingTest {

    @Test
    void testSmallBoardN1() {
        int n = 1;
        int expectedWays = 1; // Only 1 way to place a single domino vertically
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testSmallBoardN2() {
        int n = 2;
        int expectedWays = 2; // 2 ways: either two vertical dominoes or two horizontal dominoes
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testSmallBoardN3() {
        int n = 3;
        int expectedWays = 5; // 5 ways: 2 vertical dominoes + 1 tromino or a combination of dominoes and trominoes
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testMediumBoardN4() {
        int n = 4;
        int expectedWays = 11; // 11 ways to tile a 2x4 board using dominos and trominos
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testLargerBoardN5() {
        int n = 5;
        int expectedWays = 24; // 24 possible ways to tile a 2x5 board
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testLargerBoardN6() {
        int n = 6;
        int expectedWays = 53; // 53 possible ways to tile a 2x6 board
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testVeryLargeBoardN10() {
        int n = 10;
        int expectedWays = 571; // 571 possible ways to tile a 2x10 board
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testEdgeCaseZero() {
        int n = 0;
        int expectedWays = 1; // 1 way to tile an empty board (do nothing)
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testNegativeN() {
        int n = -1;
        assertThrows(IllegalArgumentException.class, () -> BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testLargeBoardN100() {
        int n = 100;
        assertDoesNotThrow(() -> BoardTiling.numberOfWaysToTile(n));
    }

    @Test
    void testRandomCase() {
        int n = 7;
        int expectedWays = 117; // 117 ways to tile a 2x7 board
        assertEquals(expectedWays, BoardTiling.numberOfWaysToTile(n));
    }
}