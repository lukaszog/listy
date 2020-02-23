package pl.sda.listy;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Lista lista = new ListaImplementacja();
        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(3);
        lista.dodajElement(4);
        lista.dodajElement(5);
        lista.dodajElement(6);
        lista.dodajElement(7);
        lista.dodajElement(8);
        lista.dodajElement(9);
        lista.dodajElement(10);
        lista.dodajElement(11);
        lista.dodajElement(12);
        lista.dodajElement(13);
        lista.dodajElement(14);
        lista.dodajElement(15);
        lista.dodajElement(16);

        System.out.println(lista);

        StringBuilder s = new StringBuilder();
        s.append("Hej");
        s.append("CZESC");
        s.append("2221");
        System.out.println(s);

    }
}
