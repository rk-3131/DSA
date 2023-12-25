package com.company;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        System.out.println(factorsOfNumber(20));
        System.out.println(factorsOfNumber2(20));
    }
    static List<Integer> factorsOfNumber2(int n){
        List<Integer> listInc = new ArrayList<Integer>();
        List<Integer> listDec = new ArrayList<Integer>();

        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){

                if (i == (n / i)){
                    listInc.add(i);
                }else {
                    listInc.add(i);
                    listDec.add(n / i);
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>();

        while (!listInc.isEmpty()){
            list.add(listInc.remove(0));
            if (!listDec.isEmpty()){
                list.add(listDec.remove(listDec.size() - 1));
            }
        }
        return list;
    }

    static List<Integer> factorsOfNumber(int n){
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                list.add(i);
            }
        }
        return list;
    }
}
