package com.company;

public class Skipping_a {
    public static void main(String[] args) {
        String str = "akakakakakakaahak";
        System.out.println(skip_a(str, new StringBuilder(""), 0));
        System.out.println(skip_a("", str));
        System.out.println(skipString(str, "", "ak"));

    }

    static String skipString(String up, String p, String sub){
        if (up.isEmpty() || up == null){
            return p;
        }

        if (up.startsWith(sub)){
            return skipString(up.substring(sub.length()), p, sub);
        }

        p += up.charAt(0);
        return skipString(up.substring(1), p, sub);
    }
    static String skip_a(String prepared, String unPrepared){
        if (unPrepared.length() == 0 || unPrepared == null){
            return prepared;
        }

        if (unPrepared.charAt(0) == 'a'){
            return skip_a(prepared, unPrepared.substring(1));
        }

        prepared += Character.toString(unPrepared.charAt(0));
        return skip_a(prepared, unPrepared.substring(1));
    }
    static String skip_a(String s, StringBuilder sb, int index){
        if (index == s.length()){
            return sb.toString();
        }

        if (s.charAt(index) == 'a'){
            return skip_a(s, sb, index + 1);
        }

        sb.append(s.charAt(index));
        return skip_a(s, sb, index + 1);
    }
}
