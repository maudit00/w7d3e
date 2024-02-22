package Chain;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    Maggiori maggiore = new Maggiori("Maggiore", null, 3000);
    Capitani capitano = new Capitani("Capitano", maggiore, 2000);
    Tenenti tenente = new Tenenti("Tenente", capitano, 1000);

    tenente.confrontaStipendi(1500);
  }
}
