public class Chaussure extends Taille {
  public Chaussure() {
    cmpAge = new TailleBebe();
    cmpGenre = new PourHomme();
    cmpMesure = new UniteUniverselle();
  }
  public void afficherTaille() {
    System.out.println("\n"+"chaussure:");
  }
}