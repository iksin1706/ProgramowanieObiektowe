package com.company;

public class Main {

    public static void main(String[] args) {

        Samolot samolot=new Samolot();
        samolot.lec();

        Poduszkowiec poduszkowiec=new Poduszkowiec();
        poduszkowiec.jedz();
        poduszkowiec.plyn();


    }
}


abstract class SrodekTransportu{

}

interface Plywa{
    void plyn();
}
interface Lata{
    void lec();
}
interface Jezdzi{
    void jedz();
}

class Statek extends SrodekTransportu implements Plywa{
    public void plyn(){
        System.out.println("Plyne se");
    }
}
class Samolot extends SrodekTransportu implements Lata{
    public void lec(){
        System.out.println("Lece se");
    }
}
class Samochod extends SrodekTransportu implements Jezdzi{
    public void jedz(){
        System.out.println("Jade se");
    }
}
class Poduszkowiec extends SrodekTransportu implements Jezdzi,Plywa{
    public void jedz(){
        System.out.println("Sune sobie po ladzie ");
    }
    public void plyn(){
        System.out.println("Sune sobie po wodze");
    }
}
