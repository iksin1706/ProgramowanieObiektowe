package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class Main {

    public static void DodajTylkoPelnoletniegoUczestnika(Uczestnik uczestnik,LinkedList<Uczestnik> uczestnicy){
        if(uczestnik.pelnoletni())uczestnicy.add(uczestnik);
    }
    public static void DodajUczestnika(Uczestnik uczestnik,LinkedList<Uczestnik> uczestnicy){
        uczestnicy.add(uczestnik);
    }

    public static void main(String[] args) {
        LinkedList<Uczestnik> uczestnicy=new LinkedList<Uczestnik>();

        DodajTylkoPelnoletniegoUczestnika(new Uczestnik(1,"Jan",23),uczestnicy);
        DodajTylkoPelnoletniegoUczestnika(new Uczestnik(2,"Grzes",15),uczestnicy);
        DodajTylkoPelnoletniegoUczestnika(new Uczestnik(3,"Damian",19),uczestnicy);


        Pies[] piesy=new Pies[3];
        piesy[0]=new Pies();
        piesy[1]=new Pies();
        piesy[2]=new Pies();

        LinkedList<Pies> piesList=new LinkedList<Pies>();

        for (int i = 0; i < 3; i++) {
            piesList.add(piesy[i]);
        }
        LinkedList<Pies> piesowKilka= (LinkedList<Pies>) piesList.subList(1,2);
        piesList.removeAll(piesowKilka);

        LinkedList<Integer> int1=new LinkedList<Integer>();
        int1.add(1);
        int1.add(2);
        int1.add(3);

        LinkedList<Integer> int2=new LinkedList<Integer>();

        ListIterator<Integer> intIterator = int1.listIterator();

        // Traversing elements
        while (intIterator.hasNext()) {
            int2.addFirst(intIterator.next());
        }

    }
    
}
class Pies {
    String imie;
    String rasa;
}

class Uczestnik {
    int ID;
    String imie;
    int wiek;

    public Uczestnik(int ID, String imie, int wiek) {
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }

    public boolean pelnoletni(){
        if(wiek>18)return true;
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return ID == uczestnik.ID && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, imie, wiek);
    }
}
