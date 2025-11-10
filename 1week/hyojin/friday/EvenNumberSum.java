package com.youable.starter;

public class EvenNumberSum {
    public static void main(String[] args) {
        System.out.println(programmersSolution(1));
    }

    public static int solution(int n) {
        if (n < 2) return 0;

        int sum = 0;
        while (n >= 2) {
            if (n % 2 == 0) sum += n;
            n--;
        }
        return sum;
    }

    public static int programmersSolution(int n) {
        if (n < 2) return 0;

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
