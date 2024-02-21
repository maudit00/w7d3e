package Composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setPrice(20);
        libro.setAutori(List.of(new Autori("Tolkien")));
        Pagine p1 = new Pagine();
        p1.setContenuto("ciaociao");
        p1.setnPagina(1);
        SezioneIndice indice = new SezioneIndice();
        indice.setPagine(List.of(p1));
        indice.setTitolo("indice");
        SezioneIntroduzione introduzione = new SezioneIntroduzione();
        introduzione.setSezioni(List.of(indice));
        introduzione.setTitolo("introduzione");
        libro.setSezioni(List.of(introduzione));

        System.out.println(libro);
        System.out.println(introduzione);
        System.out.println(indice);
        System.out.println(p1);

    }
}
