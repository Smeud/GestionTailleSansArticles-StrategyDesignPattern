public class TailleHautEtBas extends Taille {
  public TailleHautEtBas() {
    cmpAge = new TailleAdulte();
    cmpGenre = new PourFemme();
    cmpMesure = new UniteUniverselle();
  }
  public void afficherTaille() {
    System.out.println("\n"+"haute et basse:");
  }
}
