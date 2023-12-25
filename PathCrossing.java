package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PathCrossing {
    public static void main(String[] args) {
        String str = "NESWW";
//        String str = "WSWNNNNWWNWWN";
        System.out.println(isCrossed(str));
//        System.out.println(findPath(str));
    }
    static boolean isCrossed(String path){
        List<Integer> xList = new ArrayList<Integer>();
        List<Integer> yList = new ArrayList<Integer>();

        int x = 0;
        int y = 0;
        yList.add(y);
        xList.add(x);

        for (int i = 0; i < path.length(); i++){
            if (path.charAt(i) == 'N'){
                y++;
            }else if (path.charAt(i) == 'W'){
                x--;
            }else if (path.charAt(i) == 'E'){
                x++;
            }else{
                y--;
            }

            for (int j = 0; j < xList.size(); j++){
                if (xList.get(j) == x && yList.get(j) == y){
                    return true;
                }
            }
            yList.add(y);
            xList.add(x);
        }
        return false;
    }
    static boolean findPath(String path){
        Set<String> set = new HashSet<String>();

        int x = 0;
        int y = 0;

        set.add(x + "," + y);

        for (int i = 0; i < path.length(); i++){
            if (path.charAt(i) == 'N'){
                y++;
            }else if (path.charAt(i) == 'W'){
                x--;
            }else if (path.charAt(i) == 'E'){
                x++;
            }else{
                y--;
            }

            String current = x + "," + y;

            if (set.contains(current)){
                return true;
            }

            set.add(current);
        }
        return false;
    }
}
