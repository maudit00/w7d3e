package Composite;

import java.util.List;

public class Sezioni extends ComponenteLibro{
    private List<ComponenteLibro> componenti;

    public Sezioni(List<ComponenteLibro> componenti){
        this.componenti = componenti;
    }

    @Override
    public int getPagesNumber() {
        return componenti.stream().mapToInt(componenteLibro -> componenteLibro.getPagesNumber()).sum();
    }
}
