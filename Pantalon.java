public class Pantalon extends Taille {
  public Pantalon() {
    cmpAge = new TailleAdulte();
    cmpGenre = new PourFemme();
    cmpMesure = new UniteMetrique();
  }
  public void afficherTaille() {
    System.out.println("\n"+"pantalon:");
  }
}