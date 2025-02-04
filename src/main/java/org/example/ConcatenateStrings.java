package org.example;

public class ConcatenateStrings {
    public static String concatenateStrings(String arr[]){
        StringBuilder br=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            br.append(arr[i]);
        }
        return br.toString();
    }
    public static void main(String[] args) {

        String arr[]={"Good"," Morning"," Boss!!"};
        System.out.println();

        System.out.println(concatenateStrings(arr));
    }
}
