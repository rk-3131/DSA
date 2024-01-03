package com.company;

public class BackTracking {
    public static void main(String[] args) {
        printMatrix(0, 0, new boolean[3][3], new int[3][3], 1);
    }
    static void printMatrix(int r, int c, boolean [][] visited, int [][] matrix, int step){
        if (r == visited.length - 1 && c == visited[r].length - 1){
            matrix[r][c] = step;
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            return;
        }

        if (visited[r][c] == true){
            return;
        }

        if (r < matrix.length - 1){
            visited[r][c] = true;
            matrix[r][c] = step;
            printMatrix(r + 1, c, visited, matrix, step + 1);
            visited[r][c] = false;
            matrix[r][c] = 0;
        }

        if (r > 0){
            matrix[r][c] = step;
            visited[r][c] = true;
            printMatrix(r - 1, c, visited, matrix, step + 1);
            matrix[r][c] = 0;
            visited[r][c] = false;
        }

        if (c < matrix[r].length - 1){
            matrix[r][c] = step;
            visited[r][c] = true;
            printMatrix(r, c + 1, visited, matrix, step + 1);
            matrix[r][c] = 0;
            visited[r][c] = false;
        }

        if (c > 0){
            matrix[r][c] = step;
            visited[r][c] = true;
            printMatrix(r, c - 1, visited, matrix, step + 1);
            matrix[r][c] = 0;
            visited[r][c] = false;
        }
    }
    static void printAllPaths(int r, int c, String path, boolean [][] visited){
        if (r == visited.length - 1 && c == visited[r].length - 1){
            System.out.println(path);
            return;
        }

        if (visited[r][c] == true){
            return;
        }

        if (r < visited.length - 1){
            visited[r][c] = true;
            printAllPaths(r + 1, c, path + "D", visited);
            visited[r][c] = false;
        }

        if (c < visited[r].length - 1){
            visited[r][c] = true;
            printAllPaths(r, c + 1, path + "R", visited);
            visited[r][c] = false;
        }

        if (r > 0){
            visited[r][c] = true;
            printAllPaths(r - 1, c, path + "U", visited);
            visited[r][c] = false;
        }

        if (c > 0){
            visited[r][c] = true;
            printAllPaths(r, c - 1, path + "L", visited);
            visited[r][c] = false;
        }
    }
}
