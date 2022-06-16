package com.company;

import org.w3c.dom.css.Rect;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(isTriangle(a,b));
    }

    public static void nums(double a, double b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
    }

    public static boolean isEven(double a) {
        if (a % 2 == 0) return true;
        return false;
    }
    public static boolean isDivisibleThreeFive(double a) {
        if (a % 3 == 0&&a%5==0) return true;
        return false;
    }
    public static double power3(double a) {
        return Math.pow(a,3);
    }
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }
    public static boolean isTriangle(int num1,int num2){

        Random rand = new Random();

        int a = rand.nextInt((num2-num1+1))+num1;
        int b = rand.nextInt((num2-num1+1))+num1;
        int c = rand.nextInt((num2-num1+1))+num1;
        System.out.println("Trojkat");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double max=a;
        if(b>a)max=b;
        if(c>b)max=c;

        if(max==a && a<b+c) return true;
        else if(max==b && b<a+c) return true;
        else if(max==c && c<b+a) return true;

        return false;
    }
}
