package pl.sda.listy;

public class ListaImplementacja implements Lista {

    private int[] liczby;
    private int pojemnosc = 10;
    private int rozmiar;

    ListaImplementacja(){
        this.liczby = new int[this.pojemnosc];
    }

    ListaImplementacja(int pojemnosc){
        this.liczby = new int[pojemnosc];
    }

    @Override
    public void dodajElement(int liczba) {

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
}
