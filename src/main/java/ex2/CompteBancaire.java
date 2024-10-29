package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double decouvert;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected String type;
	
	/** Constructeur de compte bancaire
	 * @param type = CC
	 * @param solde représente le solde du compte
	 * @param decouvert représente le découvert autorisé
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){

		this.solde += montant;
	}
	
	/** Debite un montant au solde
	 * Si c'est un compte courant, il faut vérifier si le nouveau solde n'est pas inférieur au découvert autorisé
	 * Si c'est un livretA, il faut vérifier que le novueau solde n'est pas négatif
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
				this.solde = solde - montant;
		}
	}


	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter for solde
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter for decouvert
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter for type
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
