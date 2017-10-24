package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    String s = "anagram";
	    String t = "naagrma";
        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t){
        int[] alphabet = new int[26];
        for(int i = 0; i < s.length(); ++i){
            alphabet[s.charAt(i)-'a'] += 1;
        }
        for(int i = 0; i < t.length(); ++i){
            alphabet[t.charAt(i)-'a'] -= 1;
        }
        for(int i = 0; i < alphabet.length; ++i){
            if(alphabet[i]!=0){
                return false;
            }
        }
        return true;


//        List<String> first = new ArrayList<>();
//        List<String> second = new ArrayList<>();
//        if(s.length()!=t.length()){
//            return false;
//        }
//        for(int i = 0; i < s.length(); ++i){
//            first.add(String.valueOf(s.charAt(i)));
//            second.add(String.valueOf(t.charAt(i)));
//        }
//        Collections.sort(first);
//        Collections.sort(second);
//        return first.equals(second);
    }
}
