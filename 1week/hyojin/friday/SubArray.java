package com.youable.starter;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 1, 3));;
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int index = 0;
        for (int i = num1; i <= num2; i++) {
            answer[index++] = numbers[i];
        }
        return answer;
    }

    public static int[] programmersSolution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
