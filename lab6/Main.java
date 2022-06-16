package com.company;

public class Main {

    public static void main(String[] args) {
    Punkt pkt1= new Punkt();
    Punkt pkt2= new Punkt(5,8);
    Figura f1=new Figura();
    Trojkat t1=new Trojkat(5,8);
    Prostokat p1=new Prostokat(5,20);

    pkt1.opis();
    pkt1.przesun(20,20);
    pkt1.opis();

    pkt2.opis();
    pkt2.przesun(15,15);
    pkt2.opis();
    }
}


class Figura{
Punkt punkt;
String kolor="bialy";

    public Figura(){

    }

    public Figura(Punkt punkt, String kolor) {
        this.punkt = punkt;
        this.kolor = kolor;
    }
    public void opisz(){
        System.out.println("x:"+punkt.x+" y:"+punkt.y+"Kolor"+kolor);
    }

}
class Trojkat extends Figura{
    double wys,podstawa;

    public Trojkat(double wys, double podstawa) {
        this.wys = wys;
        this.podstawa = podstawa;
    }
}
class Prostokat extends Figura{
    double wys,szer;

    public Prostokat(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;
    }
    public double getPowierzchnia(){return wys*szer}
}

class Punkt{
    public double x,y;
    public Punkt() {
        this.x=0;
        this.y=0;
    }

    public Punkt(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void zeruj(){
        x=0;
        y=0;
    }
    public void przesun(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void opis(){
        System.out.println("x:"+x+" y:"+y);
    }
}

class Okrag extends Figura{
    Punkt srodek;
    double promien;

    public double getPowierzchnia(){
        return Math.PI*Math.pow((promien,2);
    }
    public double getSrednica(){
        return 2*promien;
    }
    public void setPromien(double p){
        this.promien = p;
    }

    public Okrag() {
        this.promien=0;
        this.srodek.x=0;
        this.srodek.y=0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public boolean wSrodku(Punkt p){
        if(Math.pow((p.x+srodek.x),2)+Math.pow(p.y+ srodek.y,2) <= Math.pow(promien,2)) return true;
        else return false ;
    }
}
