package com.company;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        permutationPrint("", "abc");
        permutationPrint2("", "xyz");
        System.out.println(permutationList("", "pqr"));
        System.out.println(countPermutation("", "pqrs"));
    }

    static int countPermutation(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        int ans = 0;

        for (int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            char ch = up.charAt(0);
            ans += countPermutation(f + ch + s, up.substring(1));
        }

        return ans;
    }

    static List<String> permutationList(String p, String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<String>();

        for (int i = 0; i <= p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            char ch = up.charAt(0);
            ans.addAll(permutationList(first + ch + second, up.substring(1)));
        }

        return ans;
    }
    static void permutationPrint2(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        for (int i = 0; i <= p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            char ch = up.charAt(0);
            permutationPrint2(first + ch + second, up.substring(1));
        }
    }
//    we will print the different permutations that we can get
    static void permutationPrint(String p, String up){
        if (up.isEmpty()){
//            When we get the unprocessed string as empty then we have at least got one of the answer
//            At that point we have to print the string and function call can be returned
            System.out.println(p);
            return;
        }

//        now if we consider the recursion tree then we can see that for every step the recursion will be happening for the p + 1 times
        for (int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            char ch = up.charAt(0);
            permutationPrint(f + ch + s, up.substring(1));
        }
    }
}
