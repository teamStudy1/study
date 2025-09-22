package com.youable.starter;

import java.util.ArrayList;
import java.util.Arrays;

public class TallerThanMe {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(lowVersion(new int[]{149, 180, 192, 170}, 167));
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }

    public static int lowVersion(int[] array, int height) {
        int ans = 0;
        for (int value: array) {
            if (value > height) ans++;
        }

        return ans;
    }
}
