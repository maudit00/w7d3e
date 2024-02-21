package Composite;

import java.util.List;

public class Libro {
    private List<Sezioni> sezioni;
    private List<Autori> autori;
    private double price;

    public Libro() {
    }

    public List<Sezioni> getSezioni() {
        return sezioni;
    }

    public void setSezioni(List<Sezioni> sezioni) {
        this.sezioni = sezioni;
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

    @Override
    public String toString() {
        return "Libro{" +
                "sezioni=" + sezioni+
                ", autori=" + autori +
                ", price=" + price +
                '}';
    }



}
