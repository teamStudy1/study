package com.youable.starter;

import java.util.Arrays;

public class MultipleOfN {
    public static void main(String[] args) {
        int[] result = solution(5, new int[]{1, 9, 3, 10, 13, 5});
        System.out.println(result);
    }

    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}
