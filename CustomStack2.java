package com.company;

import java.util.ArrayList;
import java.util.List;

public class CustomStack2 {
    List<Integer> list;

    CustomStack2(){
        list = new ArrayList<Integer>();
    }

    int getSize(){
        return list.size();
    }

    boolean push(int number){
        list.add(number);
        return true;
    }

    int pop(){
        int temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return temp;
    }

}
