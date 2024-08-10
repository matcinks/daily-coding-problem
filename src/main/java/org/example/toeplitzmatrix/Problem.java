package org.example.toeplitzmatrix;

public class Problem {

    public static boolean isToeplitz(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int nextI = i + 1;
                int nextJ = j + 1;
                int value = matrix[i][j];
                while(nextI < matrix.length - 1 && nextJ < matrix[i].length - 1) {
                    if (value != matrix[nextI][nextJ]) {
                        return false;
                    }
                    nextJ++;
                    nextI++;
                }
            }
        }
        return true;
    }
}