package Composite;

import java.util.ArrayList;
import java.util.List;

public class SezioneIntroduzione implements Sezioni{
    private String titolo;
    private List<Sezioni> sezioni = new ArrayList<>();
    private List<Pagine> pagine = new ArrayList<>();

    public SezioneIntroduzione(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public List<Sezioni> getSezioni() {
        return sezioni;
    }

    public void setSezioni(List<Sezioni> sezioni) {
        this.sezioni = sezioni;
    }


    @Override
    public String toString() {
        return "SezioneIntroduzione{" +
                "titolo='" + titolo + '\'' +
                ", sezioni=" + sezioni +
                ", pagine=" + pagine +
                '}';
    }

    public SezioneIntroduzione() {
    }

    @Override
    public void StampaPagine() {
        pagine.forEach(System.out::println);
    }
}
