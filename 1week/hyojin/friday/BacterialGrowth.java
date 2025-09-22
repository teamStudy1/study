package com.youable.starter;

public class BacterialGrowth {
    public static void main(String[] args) {
        System.out.println(solution(10, 15));
    }

    public static int solution(int n, int t) {
        for (int i = 0; i < t; i++) {
            n *= 2;
        }
        return n;
    }

    public static int programmersSolution(int n, int t) {
        int answer = 0;
        answer = n << t;
        return answer;
    }
}
