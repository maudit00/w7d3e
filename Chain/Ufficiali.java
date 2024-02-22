package Chain;

/**
 * Ufficiali
 */
public abstract class Ufficiali {

  private String funzione;
  private Ufficiali responsabile;
  private int stipendio;

  public Ufficiali(String funzione, Ufficiali responsabile, int stipendio) {
    this.funzione = funzione;
    this.responsabile = responsabile;
    this.stipendio = stipendio;
  }

  public String getFunzione() {
    return funzione;
  }

  public int getStipendio() {
    return stipendio;
  }

  public Ufficiali getResponsabile() {
    return responsabile;
  }

  public void setFunzione(String funzione) {
    this.funzione = funzione;
  }

  public void setStipendio(int stipendio) {
    this.stipendio = stipendio;
  }

  public void setResponsabile(Ufficiali responsabile) {
    this.responsabile = responsabile;
  }

  public void confrontaStipendi(int stipendioRiferimento) {
    if (getStipendio() >= stipendioRiferimento) {
      System.out.println(getFunzione() + " ha uno stipendio maggiore di " + stipendioRiferimento);
    }
    if (getResponsabile() != null) {
      getResponsabile().confrontaStipendi(stipendioRiferimento);
    }
  }
}
