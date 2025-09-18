package com.wanted.f_activity.mission.c_deep;

import java.util.Arrays;
import java.util.Scanner;

public class Advanced {

    private static final int SQUARE_SIZE = 3;

    public static void main(String[] args) {
        int[][] magicSquare = readMagicSquare();
        boolean isMagic = isMagicSquare(magicSquare);
        printResult(isMagic);
    }

    private static int[][] readMagicSquare() {
        System.out.println("3x3 마방진의 숫자를 한 줄에 하나씩, 공백으로 구분하여 입력하세요.");
        int[][] square = new int[SQUARE_SIZE][SQUARE_SIZE];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < SQUARE_SIZE; i++) {
            square[i] = Arrays.stream(sc.nextLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();
        }
        return square;
    }

    private static boolean isMagicSquare(int[][] square) {
        // 1. 첫 번째 행의 합을 기준값으로 설정
        int magicSum = Arrays.stream(square[0]).sum();

        // 2. 모든 행의 합 검사
        for (int i = 1; i < SQUARE_SIZE; i++) {
            if (Arrays.stream(square[i]).sum() != magicSum) {
                return false;
            }
        }

        // 3. 모든 열의 합 검사
        for (int i = 0; i < SQUARE_SIZE; i++) {
            int colSum = 0;
            for (int j = 0; j < SQUARE_SIZE; j++) {
                colSum += square[j][i];
            }
            if (colSum != magicSum) {
                return false;
            }
        }

        // 4. 대각선 합 검사
        int mainDiagonalSum = 0;
        int antiDiagonalSum = 0;
        for (int i = 0; i < SQUARE_SIZE; i++) {
            mainDiagonalSum += square[i][i];
            antiDiagonalSum += square[i][SQUARE_SIZE - 1 - i];
        }

        return mainDiagonalSum == magicSum && antiDiagonalSum == magicSum;
    }

    private static void printResult(boolean isMagic) {
        System.out.println(
                "[마방진 판별 결과]\n" +
                        (isMagic ? "마방진입니다." : "마방진이 아닙니다.")
        );
    }
}