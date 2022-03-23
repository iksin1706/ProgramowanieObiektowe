package com.company;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    public static Random rand;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println(zad5(scanner.next()));
        rand=new Random();
    }

    public static void zad1(double n){
        int i=0,suma=0;
        while (i<n) {
            suma += scanner.nextDouble();
            i++;
        }
        System.out.println(suma/n);
    }
    public static void zad2(){
        double sumaD = 0,sumaU=0,iloscD=0,iloscU=0,num;
        for (int i = 0; i < 10; i++) {
            num=scanner.nextDouble();
            if(num<0){
                sumaU+=num;
                iloscU++;
            }
            else{
                sumaD+=num;
                iloscD++;
            }
        }
        System.out.println("Ilosc dodatnie "+iloscU);
        System.out.println("Suma dodatnie "+sumaU);
        System.out.println("Ilosc ujemne "+iloscU);
        System.out.println("Suma ujemne "+sumaU);
    }
    public static void zad3(double[] array){
        double suma=0;
        for (int i = 0; i < array.length; i++) {
            if(i%2==0)suma+=array[i];
        }
        System.out.println(suma);
    }
    public static void zad4(int n){
        double array[] =new double[n];
        for (int i = 0; i < n; i++) {
            array[i]= Math.random()*56-10;
        }
    }
    public static boolean zad5(String s) {

        char[] text1 = s.toCharArray();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (text1[Math.abs(i - s.length()) - 1] != text1[i]) {
                return false;
            }
        }
        return true;
    }
}
