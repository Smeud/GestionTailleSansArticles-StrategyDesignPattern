public class SousVetement extends Taille {
  public SousVetement() {
    cmpAge = new TailleEnfant();
    cmpGenre = new Mixte();
    cmpMesure = new UniteUniverselle();
  }
  public void afficherTaille() {
    System.out.println("\n"+"sous-vetement:");
  }
}