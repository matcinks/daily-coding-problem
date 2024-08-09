package org.example.theoplitzmatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {
    @Test
    void testValidToeplitzMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4, 8},
                {5, 1, 2, 3, 4},
                {4, 5, 1, 2, 3},
                {7, 4, 5, 1, 2}
        };
        assertTrue(Problem.isToeplitz(matrix));
    }

    @Test
    void testInvalidToeplitzMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4, 8},
                {5, 1, 9, 3, 4},
                {4, 5, 1, 2, 3},
                {7, 4, 5, 1, 2}
        };
        assertFalse(Problem.isToeplitz(matrix));
    }

    @Test
    void testSingleElementMatrix() {
        int[][] matrix = {
                {42}
        };
        assertTrue(Problem.isToeplitz(matrix));
    }

    @Test
    void testRowMatrix() {
        int[][] matrix = {
                {1, 2, 3, 4}
        };
        assertTrue(Problem.isToeplitz(matrix));
    }

    @Test
    void testColumnMatrix() {
        int[][] matrix = {
                {1},
                {2},
                {3},
                {4}
        };
        assertTrue(Problem.isToeplitz(matrix));
    }

    @Test
    void testEmptyMatrix() {
        int[][] matrix = {};
        assertTrue(Problem.isToeplitz(matrix));
    }

    @Test
    void testNonSquareToeplitzMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 1, 2},
                {7, 4, 1},
                {8, 7, 4}
        };
        assertTrue(Problem.isToeplitz(matrix));
    }

    @Test
    void testNonSquareInvalidMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 1, 2},
                {7, 5, 1},
                {8, 7, 4}
        };
        assertFalse(Problem.isToeplitz(matrix));
    }

    @Test
    void testLargeValidToeplitzMatrix() {
        int[][] matrix = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                matrix[i][j] = i - j;
            }
        }
        assertTrue(Problem.isToeplitz(matrix));
    }

    @Test
    void testLargeInvalidToeplitzMatrix() {
        int[][] matrix = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                matrix[i][j] = i - j;
            }
        }
        matrix[50][50] = 999; // Introduce a violation in the Toeplitz property
        assertFalse(Problem.isToeplitz(matrix));
    }
}