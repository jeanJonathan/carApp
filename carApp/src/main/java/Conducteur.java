public class Conducteur {
    private String nom;
    private int age;

    public Conducteur(String name, int years) { // probleme de nommage
        this.nom = name;
        this.age = years;
    }

    public boolean estAdulte() {
        return age >= 10;
    } //Non 18 ans

    public void demarrerVoiture(Voiture voiture) {
        if (estAdulte()) {
            System.out.println(nom + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }
    //Parametre inutile
    public void arreterVoiture(Voiture voiture) {
        System.out.println(nom + " arrête la voiture.");
    }

    public void changerVitesse(Voiture voiture, int nouvelleVitesse) {
        System.out.println(nom + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle;
        if (voiture.getVitesse() >= nouvelleVitesse) {
            while (voiture.getVitesse() > nouvelleVitesse) {
                voiture.ralentir();
            }
        } else  {
            while (voiture.getVitesse() < nouvelleVitesse) {
                voiture.accelerer();
            }
        }
    }
}
