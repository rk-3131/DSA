package com.company;

public class NQueens {
    public static void main(String[] args) {
        boolean [][] matrix = new boolean[4][4];
        System.out.println(placeQueens(matrix, 0));
        System.out.println(placeQueens2(matrix, 0));
    }
    static int placeQueens2(boolean [][] matrix, int col){
        if (col == matrix[0].length){
            display(matrix);
            System.out.println();
            return 1;
        }

        int ans = 0;

        for (int i = 0; i < matrix.length; i++){
            if (isSafe2(matrix, i, col)){
                matrix[i][col] = true;
                ans += placeQueens2(matrix, col + 1);
                matrix[i][col] = false;
            }
        }
        return ans;
    }

    static boolean isSafe2(boolean [][] matrix, int row, int col){
//        Check for the right of the element in the same row

        for (int i = 0; i < col; i++){
            if (matrix[row][i]){
                return false;
            }
        }

//        Check for the upper side diagonal
        int upperMax = Math.min(row, col);
        for (int i = 1; i <= upperMax; i++){
            if (matrix[row - i][col - i]){
                return false;
            }
        }

        int lowerMax = Math.min(matrix.length - row - 1, col);

        for (int i = 1; i <= lowerMax; i++){
            if (matrix[row + i][col - i]){
                return false;
            }
        }
        return true;
    }





















    static int placeQueens(boolean [][] matrix, int row){
        if (row == matrix.length){
            display(matrix);
            System.out.println();
            return 1;
        }
        int ans = 0;

        for (int i = 0; i < matrix[row].length; i++){
            if (isSafe(matrix, row, i)){
                matrix[row][i] = true;
                ans += placeQueens(matrix, row + 1);
                matrix[row][i] = false;
            }
        }
        return ans;
    }

    static boolean isSafe(boolean [][] matrix, int row, int col){
//        Check for the whole column vertically

        for (int i = 0; i < row; i++){
            if (matrix[i][col]){
                return false;
            }
        }

//        Check for the left side diagonal

        int leftMax = Math.min(row, col);

        for (int i = 1; i <= leftMax; i++){
            if (matrix[row - i][col - i]){
                return false;
            }
        }

//        Check for the right diagonal

        int rightMax = Math.min(row, matrix.length - col - 1);

        for (int i = 1; i <= rightMax; i++){
            if (matrix[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean [][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j]){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
