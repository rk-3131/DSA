package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubsetPattern {
    public static void main(String[] args) {
        subSequence("", "abc");
        System.out.println(subSequenceList("", "pqr"));
    }
    static List<String> subSequenceList(String p, String up){
        if (up.isEmpty()){
            List<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<String>();
        char ch = up.charAt(0);

        ans.addAll(subSequenceList(p, up.substring(1)));
        ans.addAll(subSequenceList(p + ch, up.substring(1)));

        return ans;

    }
    static void subSequence(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSequence(p, up.substring(1));
        subSequence(p + ch, up.substring(1));
    }
    static void subSetOfString(String org, String made, List<String> list){
        if (org.length() == 0 || org.isEmpty() || org == null){
            list.add(made);
            return;
        }

        subSetOfString(org.substring(1), made, list);

        made += Character.toString(org.charAt(0));
        subSetOfString(org.substring(1), made, list);

    }
}
