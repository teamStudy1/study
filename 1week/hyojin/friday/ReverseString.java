package com.youable.starter;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
    }

    public static String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        return sb.append(my_string).reverse().toString();
    }
}
