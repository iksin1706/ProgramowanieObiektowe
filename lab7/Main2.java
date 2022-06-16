package com.company;

public class Main {

    public static void main(String[] args) {

        Wieloryb wieloryb=new Wieloryb();
        wieloryb.jedz();
        wieloryb.plyn();
    }
}
abstract class Zwierze {

}
abstract class Ryba extends Zwierze implements Plywanie{
    abstract void jedz();
    abstract void wydalaj();
}
class Wieloryb extends Zwierze implements Plywanie{ //Wieloryb to nie ryba jeżeli taki był zamysł
    public void jedz(){
        System.out.println("Wieloryb je");
    }
    public void wydalaj(){
        System.out.println("Wieloryb wydala");
    }
    public void plyn(){
        System.out.println("Wieloryb plynie");
    }
    public void zanurz(){
        System.out.println("Wieloryb zanurza");
    }
    public void wynurz(){
        System.out.println("Wieloryb wynurza sie");
    }
}


interface Latanie{
    void lec();
    void wyladuj();
}

interface Plywanie{
    void plyn();
    void zanurz();
    void wynurz();
}
