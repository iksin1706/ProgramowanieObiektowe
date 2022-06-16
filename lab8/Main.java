package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner in= new Scanner(System.in);
        double liczba=0;
        while (true){
            try{
                liczba=in.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Podaj poprawna liczbe");
                in.next();
            }
        }
        if(liczba<0){
            throw new IllegalArgumentException(String.format("Nie ma pierwiastka z liczby %.4f ujemnej w zbiorze liczb rzeczywistych",liczba));
        }
        System.out.println(String.format("Pierwiastek z liczby %.4f to %.4f",liczba,Math.sqrt(liczba)));

        //SILNIA
        try {
            System.out.println(Silnia.silnia(-5));
        } catch (Silnia.BlednaWartoscDlaSilniException e){
            System.out.println(e.getMessage());
        }
    }
}
