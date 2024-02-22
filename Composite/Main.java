package Composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagine p1 = new Pagine();
        Pagine p2 = new Pagine();
        Pagine p3 = new Pagine();
        Pagine p4 = new Pagine();
        Pagine p5 = new Pagine();
        Pagine p6 = new Pagine();
        Pagine p7 = new Pagine();

        Autori autore = new Autori("Mario");

        Sezioni sottoSezione1 = new Sezioni(List.of(p1, p2));
        Sezioni sottoSezione2 = new Sezioni(List.of(p3, p4));
        Sezioni sottoSezione3 = new Sezioni(List.of(p5, p6));

        Sezioni sezione1 = new Sezioni(List.of(sottoSezione1, sottoSezione2));
        Sezioni sezione2 = new Sezioni(List.of(sottoSezione3, p7));

        Libro l1 = new Libro(List.of(sezione1),List.of(autore),20,"harry potter");

        System.out.println(l1.getPagesNumber());

        System.out.println(sezione1.getPagesNumber());
        System.out.println(sezione2.getPagesNumber());
        System.out.println( sottoSezione2.getPagesNumber());
    }
}
