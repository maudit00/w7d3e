package Composite;

import java.util.List;

public class Libro extends ComponenteLibro {
    private List<ComponenteLibro> componenti;
    private List<Autori> autori;
    private double price;

    private String nome;

    public Libro() {
    }

    public Libro(List<ComponenteLibro> componenti, List<Autori> autori, double price, String nome) {
        this.componenti = componenti;
        this.autori = autori;
        this.price = price;
        this.nome = nome;
    }

    public List<ComponenteLibro> getComponenti() {
        return componenti;
    }

    public void setComponenti(List<ComponenteLibro> componenti) {
        this.componenti = componenti;
    }

    public List<Autori> getAutori() {
        return autori;
    }

    public void setAutori(List<Autori> autori) {
        this.autori = autori;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getPagesNumber() {
        return componenti.stream().mapToInt(componente -> componente.getPagesNumber()).sum();
    }
}
