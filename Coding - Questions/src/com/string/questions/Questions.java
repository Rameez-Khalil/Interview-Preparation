package com.string.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Questions {

    public static String removeDuplicates(String originalString){
        //validate the argument.
        if(originalString==null) return "";

        //String with unique characters.
        StringBuilder uniqueCharacters = new StringBuilder();

        //Hashset to validate the uniqueness of the character.
        HashSet<Character> set = new HashSet<>();

        //Read the original string.
        for(char ch : originalString.toCharArray()){
            if(set.add(ch)){
                uniqueCharacters.append(ch);
            }
        }

        return uniqueCharacters.toString();
    }

    public static String reverseString(String str){
        //validate the provided argument.
        if(str==null) return "";

        return new StringBuilder(str).reverse().toString();
    }

    public static String palindromeCheck(String str){

        //check for the invalid null input.
        if(str==null) return null;

        //check for the empty string.
        if(str.isEmpty()){
            return "Palindrome";
        }


        //Reverse the string and compare it with the actual value.
        String reversed = new StringBuilder(str).reverse().toString();


        return str.equals(reversed)?"Palindrome" : "Not a palindrome";
    }

    public static boolean anagramCheck(String string1, String string2){

        //check for possible nulls.
        if(string1==null || string2==null) return false;

        //check for empty string.
        if(string1.length()!=string2.length()){
            return false;
        }



        //Find the canonical representation of both and compare them.
        //Finding canonical representation.
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        //Sort both of them.
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        String str1 = new String(chars1);
        String str2 = new String(chars2);

        return str1.equals(str2);
    }

    public static void evenOdd(String str){

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        //Read the string
        for(int i = 0; i<str.length();i++){
            if(i%2==0) even.append(str.charAt(i));
            else odd.append(str.charAt(i));
        }

        System.out.println("even : " + even.toString());
        System.out.println("odd : " + odd.toString());
    }
}
