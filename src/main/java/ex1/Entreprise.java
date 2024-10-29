package ex1;

import java.util.Date;


/** représente le concept d'entreprise */
public class Entreprise {
	/** Numero de siret	 */
	private int siret;
	/** Nom de l'entreprise */
	private String nom;
	/** Adresse de l'entreprise	 */
	private String adresse;
	/** Date de création de l'entreprise	 */
	private Date dateCreation;

	/** Constante : capital social	 */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Afficher le statut de l'entreprise (infos légales)
	 */
	public void afficherStatut() {
		System.out.println("L'entreprise " + nom + " ayant le numéro de siret " + siret + ", se trouvant à l'adresse " +
				adresse + ", a été créé le " + dateCreation);
	}

	/**
	 * Getter for siret
	 * return siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter for siret
	 *
	 * @param siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
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
	 * Getter for adresse
	 * return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter for adresse
	 *
	 * @param adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter for dateCreation
	 * return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter for dateCreation
	 *
	 * @param dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}


