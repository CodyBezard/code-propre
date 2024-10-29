package ex1;

/**
 * Classe qui propose des opérations sur les nombres
 */
public class Calcul {
// classe sans attribut d'instance ==> classe sans état,, non porteur d'information donc on peut mettre les methodes en static
	/**
	 * retour l'addition de 2 entiers passés en paramètres
	 * @param a entier 1
	 * @param b entier 2
	 * @return int
	 */
	public static int addition(int a, int b){
		return a+b;
	}

	/**
	 * retourne la soustraction de 2 entiers passés en paramètres
	 * @param a entier 1
	 * @param b entier 2
	 * @return int
	 */
	public static int sosutraction(int a, int b){
		return a-b;
	}
}
