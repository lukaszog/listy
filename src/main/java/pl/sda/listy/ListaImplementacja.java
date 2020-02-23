package pl.sda.listy;

import java.util.Arrays;

public class ListaImplementacja implements Lista {

    private int[] liczby;
    private int pojemnosc = 10;
    private int rozmiar = 0;

    ListaImplementacja(){
        this.liczby = new int[this.pojemnosc];
    }

    ListaImplementacja(int pojemnosc){
        this.liczby = new int[pojemnosc];
    }

    @Override
    public void dodajElement(int liczba) {
        if(this.rozmiar == this.pojemnosc){
            System.out.println("PELNA TABLICA");
            this.liczby = Arrays.copyOf(this.liczby, this.liczby.length*2);
            this.pojemnosc = this.liczby.length;
        }
        this.liczby[this.rozmiar] = liczba;
        this.rozmiar++;
    }


    @Override
    public int znajdz(int liczba) {
        return 0;
    }

    @Override
    public String pisz() {
        return null;
    }

    @Override
    public boolean usunPierwszy(int liczba) {
        return false;
    }

    @Override
    public void usunPowtorzenia() {

    }

    @Override
    public void zapiszDoPliku(String plik) {

    }

    @Override
    public String toString(){
        return Arrays.toString(this.liczby);
    }

}
