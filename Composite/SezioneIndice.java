package Composite;

import java.util.ArrayList;
import java.util.List;

public class SezioneIndice  implements Sezioni{
    private String titolo;
    private List<Sezioni> sezioni = new ArrayList<>();
    private List<Pagine> pagine = new ArrayList<>();

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

    public List<Pagine> getPagine() {
        return pagine;
    }

    public void setPagine(List<Pagine> pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "SezioneIndice{" +
                "titolo='" + titolo + '\'' +
                ", sezioni=" + sezioni +
                ", pagine=" + pagine +
                '}';
    }

    @Override
    public void StampaPagine() {

    }
}
