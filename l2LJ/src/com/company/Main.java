package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextDouble();
        b= scanner.nextDouble();
        c= scanner.nextDouble();

        max2(a,b,c);
    }

    public static void wynik(double a, double b, double c) {

        if(a==0){
            System.out.println("Nie jest to równanie kwadratowe");
            return;
        }

        double delta = Math.pow(b,2) - (4 * a * c);
        System.out.println(delta);
        double x1=(-b-Math.sqrt(delta))/2*a;
        double x2=(-b+Math.sqrt(delta))/2*a;
        if(delta<0) System.out.println("Nie ma rozwiazan");
        else if(delta==0) System.out.println(x1);
        else {
            System.out.println(x1);
            System.out.println(x2);
        }
    }

    public static double a(double x){
        if (x>0) return 2*x;
        else if (x==0) return 0;
        return -3*x;
    }
    public static double b(double x){
        if (x>=1) return Math.pow(x,2);
        return x;
    }
    public static double c(double x){
        if (x>2) return 2+x;
        else if (x==2) return 8;
        return x-4;
    }

    public static void max(double a,double b,double c){
        if(a>b&&a>c){
            if(b>c) System.out.println(a+" "+" "+b+" "+c);
            else  System.out.println(a+" "+" "+c+" "+b);
        }
        else if(b>a&&b>c){
            if(a>c) System.out.println(b+" "+" "+a+" "+c);
            else  System.out.println(b+" "+" "+c+" "+a);
        }
        else if(c>a&&c>b){
            if(a>b) System.out.println(c+" "+" "+a+" "+b);
            else  System.out.println(c+" "+" "+b+" "+a);
        }
    }


    public static void max2(double a,double b,double c){
        double temp;
        if(a>b){
           temp = a;
           a = b;
           b =temp;
        }
        if(a>c){
            temp = a;
            a = c;
            c =temp;
        }
        if(b>c){
            temp = b;
            b = c;
            c =temp;
        }
        System.out.println(a+" "+" "+b+" "+c);
    }

    public static void uczelna(boolean pada,boolean przystanek){
        if(pada&&przystanek) System.out.println("Wez parasol i dostaniesz sie na uczelnie");
        else if(pada&&!przystanek) System.out.println("Nie dostaniesz sie na uczelnie");
        else if(!pada&&przystanek) System.out.println("Dostaniesz sie na uczelnie, Milego dnia i pieknej pogody");
    }
    public static void samochod(boolean znizka,boolean premia){
        if(!znizka||premia) System.out.println("Możesz kupic samochod znizki nie ma");
        else if(!znizka||!premia) System.out.println("Odloz zakup na pozniej, Nie ma znizki ");
        else if(znizka||premia) System.out.println("Mozesz kupić samochod");
    }
    public static void kalkulator(double a,double b,)
}


