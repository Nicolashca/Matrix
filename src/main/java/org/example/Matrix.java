package org.example;

public class Matrix {
    private int size;
    int[][] matrix;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];

        int counter = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = counter++;

            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public int sum() {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                counter += matrix[i][j];

            }
        }
        return counter;
    }

    public int diagonalSum(){
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == j){
                    counter += matrix[i][j];
                }
            }
        }
        return counter;
    }
}






