package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	/** Nom de la caisse */
	private String nom;
	/** Poids minimum d'un item placé dans la caisse*/
	private int poidsItemMin;
	/** Poids maximum d'un item placé dans la caisse */
	private int poidsItemMax;
	/** Liste des items de la caisse */
	private List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, int poidsItemMin, int poidsItemMax) {
		super();
		this.nom = nom;
		this.poidsItemMin=poidsItemMin;
		this.poidsItemMax=poidsItemMax;
		this.items = new ArrayList<>();
	}

	public boolean accept(Item item){
		return item.getPoids()>=poidsItemMin && item.getPoids()<poidsItemMax;
	}


	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
