package com.company;

public class Silnia {
    static class BlednaWartoscDlaSilniException extends  Exception{
        BlednaWartoscDlaSilniException (String messege){
            super(messege);
        }
    }
    public static int silnia(int n) throws BlednaWartoscDlaSilniException {

        if (n < 0) throw new BlednaWartoscDlaSilniException("N musi byc wieksze od 0");

        int sil = 1;
        for (int i = 1; i <= n; i++) {
            sil *= i;
        }
        return sil;
    }
}
