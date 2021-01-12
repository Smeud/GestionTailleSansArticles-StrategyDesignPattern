public abstract class  Taille {
  ComportementAge cmpAge;
  ComportementGenre cmpGenre;
  ComportementMesure cmpMesure;

  public void renseignerAge() {
    cmpAge.age();
  }
  public void renseignerGenre() {
    cmpGenre.sexe();
  }
  public void renseignerMesure() {
    cmpMesure.mesurer();
  }

  public void setComportementAge(ComportementAge cmpAg) {
    this.cmpAge = cmpAg;
  }
  public void setComportementGenre(ComportementGenre cmpGen) {
    this.cmpGenre = cmpGen;
  }
  public void setComportementMesure(ComportementMesure cmpMes) {
    this.cmpMesure = cmpMes;
  }

  public abstract void afficherTaille();
}