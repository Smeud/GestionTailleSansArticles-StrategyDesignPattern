class Main {
  public static void main(String[] args) {
    System.out.println("\n" + "1- De la categorie de taille de:");
    Taille chaussure = new Chaussure();
    chaussure.afficherTaille();
    chaussure.renseignerAge();
    chaussure.renseignerGenre();
    chaussure.renseignerMesure();

    System.out.println("\n" + "2- De la categorie de taille de:");
    Taille pantalon = new Pantalon();
    pantalon.afficherTaille();
    pantalon.renseignerAge();
    pantalon.renseignerGenre();
    pantalon.renseignerMesure();

    System.out.println("\n" + "3- De la categorie de taille de:");
    Taille sousVetement = new SousVetement();
    sousVetement.afficherTaille();
    sousVetement.renseignerAge();
    sousVetement.renseignerGenre();
    sousVetement.renseignerMesure();

    System.out.println("\n" + "4- De la categorie de taille de:");
    Taille pizza = new Pizza();
    pizza.afficherTaille();
    pizza.renseignerAge();
    pizza.renseignerGenre();
    pizza.renseignerMesure();

    System.out.println("\n" + "5- De la categorie de taille de:");
    Taille hautEtBas = new TailleHautEtBas();
    hautEtBas.afficherTaille();
    hautEtBas.renseignerAge();
    hautEtBas.renseignerGenre();
    hautEtBas.renseignerMesure();
  }
}
