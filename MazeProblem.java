package com.company;

public class MazeProblem {
    public static void main(String[] args) {
        getPath(3,3, "");
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
