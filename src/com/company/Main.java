package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        sc.close();

        if ( a < 100)
            System.out.println("less");
        else
            System.out.println("not less");
    }
}
