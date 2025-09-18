package com.wanted.f_activity.mission.b_middle;

import java.util.HashMap;
import java.util.Scanner;

public class Intermedisate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] scores =  input.split(",");

        HashMap<String, Integer> scoreMap = new HashMap<>();
        int sum = 0;
        for (String score : scores) {
             String[] value = score.split(":");
             String key = value[0];
             int scoreValue = Integer.parseInt(value[1]);
             scoreMap.put(value[0], scoreValue);
             sum += scoreValue;
        }

        double average = (double) sum / scores.length;

        System.out.print(
                "[성적 분석 결과]\n" +
                "총점: " + sum + "\n" +
                "평균: " + average + "\n\n"
        );

        System.out.println("[과목별 등급]");
        scoreMap.forEach((key, value) -> {
            System.out.println(key + ": " + getRating(value));
        });
    }

    public static char getRating(int score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        return 'D';
    };
}
