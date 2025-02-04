package org.example;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hm = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hm.contains(str.charAt(i))) {
                sb.append(str.charAt(i));
                hm.add(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aacfscwdwjb";
        System.out.println(removeDuplicates(str));
    }
}


