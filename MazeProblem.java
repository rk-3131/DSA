package com.company;

public class MazeProblem {
    public static void main(String[] args) {
        boolean [][] obs = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPaths(0, 0, "", obs);
    }

    static void allPaths(int r, int c, String path, boolean [][] visited){

        if (r == visited.length - 1 && c == visited[r].length - 1){
            System.out.println(path);
            return;
        }

        if (visited[r][c] == false){
            return;
        }

        if (r < visited.length - 1){
            visited[r][c] = false;
            allPaths(r + 1, c, path + "D", visited);
            visited[r][c] = true;
        }

        if (c < visited[r].length - 1){
            visited[r][c] = false;
            allPaths(r, c + 1, path + "R", visited);
            visited[r][c] = true;
        }

        if (c > 0){
            visited[r][c] = false;
            allPaths(r, c - 1, path + "L", visited);
            visited[r][c] = true;
        }

        if (r > 0){
            visited[r][c] = false;
            allPaths(r - 1, c , path + "U", visited);
            visited[r][c] = true;
        }

    }

    static void mazePath(int r, int c, String path, boolean [][] obs){
        if (r == obs.length - 1 && c == obs[r].length - 1){
            System.out.println(path);
            return;
        }

        if (obs[r][c] == false){
            return;
        }

        if (r < obs.length - 1){
            mazePath(r + 1, c, path + "D", obs);
        }

        if (c < obs.length - 1){
            mazePath(r, c + 1, path + "R", obs);
        }
    }

    static void mazeWithObstacles(int r, int c, String path, boolean [][] obs){
        if (obs[r - 1][c - 1] == false){
            return;
        }

        if (r == 1 && c == 1){
            System.out.println(path);
            return;
        }

        if (r > 1){
            mazeWithObstacles(r - 1, c, path + "V", obs);
        }

        if (c > 1){
            mazeWithObstacles(r, c - 1, path + "H", obs);
        }
    }

    static void getDiagonalPath(int r, int c, String path){
        if (r == 1 && c == 1){
            System.out.println(path);
            return;
        }

        if (r > 1 && c > 1){
            getDiagonalPath(r - 1, c - 1, path + "D");
        }
        if (r > 1){
            getDiagonalPath(r - 1, c, path + "H");
        }

        if (c > 1){
            getDiagonalPath(r , c - 1, path + "V");
        }

    }

    static int getCountDiag(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int diag = 0;
        if (r > 1 && c > 1){
            diag = getCountDiag(r - 1, c - 1);
        }
        int left = getCountDiag(r - 1, c);
        int right = getCountDiag(r, c - 1);

        return left + right + diag;
    }
    static void getPath(int r, int c, String path){
        if (r == 1 && c == 1){
            System.out.println(path);
            return;
        }

        if (r > 1){
            getPath(r - 1, c, path + "R");
        }

        if (c > 1){
            getPath(r , c - 1, path + "D");
        }
    }
    static int getCount(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }

        int left = getCount(r - 1, c);
        int right = getCount(r, c - 1);

        return left + right;
    }
}
