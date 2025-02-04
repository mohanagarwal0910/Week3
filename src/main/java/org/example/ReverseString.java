package org.example;

public class ReverseString {
    public static String reverseString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {

        System.out.println(reverseString());
    }
}
