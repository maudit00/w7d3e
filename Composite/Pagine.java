package Composite;

public class Pagine {
    private int nPagina;
    private String contenuto;

    public int getnPagina() {
        return nPagina;
    }

    public void setnPagina(int nPagina) {
        this.nPagina = nPagina;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public Pagine() {
    }

    public Pagine(int nPagina, String contenuto) {
        this.nPagina = nPagina;
        this.contenuto = contenuto;
    }

    @Override
    public String toString() {
        return "Pagine{" +
                "nPagina=" + nPagina +
                ", contenuto='" + contenuto + '\'' +
                '}';
    }
}
