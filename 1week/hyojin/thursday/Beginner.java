package com.wanted.f_activity.mission.a_basic;

import java.util.Scanner;

public class Beginner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력: ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수 입력: ");
        int b = sc.nextInt();
        System.out.println(
           "[계산 결과]" + "\n" +
           "덧셈: " + add(a, b) + "\n" +
           "뺄셈: " + sub(a, b) + "\n" +
           "곱셈: " + mul(a, b) + "\n" +
           "정수 나눗셈: " + div(a, b) + "\n" +
           "실수 나눗셈: " + div((double) a, b) + "\n" +
           "나머지: " + mod(a, b)
        );
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
