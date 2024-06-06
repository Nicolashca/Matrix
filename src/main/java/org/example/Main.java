package org.example;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(8);
        matrix.print();
        System.out.println(matrix.sum());
        System.out.println(matrix.diagonalSum());

        }
    }
