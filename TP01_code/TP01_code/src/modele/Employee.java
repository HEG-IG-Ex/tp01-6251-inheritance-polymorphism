package modele;

public class Employee extends Person{
    private int salaire;
    private String cours;
    private String position;

    public Employee(String prenom, String nom, int salaire, String cours, String position) {
        super(prenom, nom);
        this.salaire = salaire;
        this.cours = cours;
        this.position = position;
    }

    public int getSalaire() {return salaire;}
    public void setHoraire(int salaire) {this.salaire = salaire;}
    public String getCours() {return this.cours;}
    public void setCours(String cours) {this.cours = cours;}

    @Override
    public String toString() {
        return super.toString()+", suis "+this.position+" du cours de "+this.cours+" et gagne CHF "+this.salaire +" par mois";
    }
}
