package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	/** Nom du Zoo */
	private String nom;
	/** Liste des animaux */
	private List<Animal> animaux = new ArrayList <Animal> ();

	/**
	 * Constructeur
	 * @param nom npm
	 */
	public Zoo(String nom){
		this.nom = nom;
	}

	//Mettre en place la classe Animal
	//Remplacer les trois listes par la liste animal

	/** Ajout d'animal dans la liste */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}

	/** Afficher la liste des animaux */
	public void afficherListeAnimaux(){
		for (int i = 0; i < animaux.size(); i++) {
			System.out.println(animaux.get(i));
		}


	}

	public int taille() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}