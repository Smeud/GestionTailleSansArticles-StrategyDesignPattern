public class Pizza extends Taille {
  public Pizza() {
    cmpAge = new AucuneTaille();
    cmpGenre = new AucunGenre();
    cmpMesure = new UniteUniverselle();
  }
  public void afficherTaille() {
    System.out.println("\n"+"pizza:");
  }
}