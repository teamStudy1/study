package ggyun.ggyun.pr.misstion;

import java.util.Scanner;

public class basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Price = sc.nextInt();

        if (Price >= 8000){
            System.out.println(Price + " 은 너무 비싸네요");
        }else{
            System.out.println(Price + " 은 적당한 가격이네요");
        }
    }
}
