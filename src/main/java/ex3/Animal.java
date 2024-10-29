package ex3;

/** Représente le concept d'animal */
public class Animal {
    /** Nom de l'animal */
    private String nom;
    /** Type : Mammifère, reptile etc... */
    private String typeAnimal;
    /** Comportement alimentaire : herbivore, carnivore, omnivore */
    private String comportement;

    /**
     * Constructeur
     * @param nom nom
     * @param type type
     * @param comportement comportement
     */
    public Animal (String nom,String type,String comportement){
       this.nom = nom;
       this.typeAnimal=type;
       this.comportement=comportement;
    }

    /**
     * Getter for nom
     * return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter for nom
     *
     * @param nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for typeAnimal
     * return typeAnimal
     */
    public String getTypeAnimal() {
        return typeAnimal;
    }

    /**
     * Setter for typeAnimal
     *
     * @param typeAnimal to set
     */
    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    /**
     * Getter for comportement
     * return comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter for comportement
     *
     * @param comportement to set
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    @Override
    public String toString() {
        return "Animal " + nom + '\'' +
                ", typeAnimal='" + typeAnimal + '\'' +
                ", comportement='" + comportement + '\'' +
                '}';
    }
}
