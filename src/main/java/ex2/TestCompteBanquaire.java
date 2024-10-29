package ex2;

public class TestCompteBanquaire {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("CC",2000,-500);
        compte.ajouterMontant(500);
        System.out.println(compte.getSolde());
        compte.debiterMontant(2000);
        System.out.println(compte.getSolde());
        LivretA livret = new LivretA(3000,5);
        livret.ajouterMontant(1000);
        System.out.println(livret.getSolde());
        livret.appliquerRemuAnnuelle();
        System.out.println(livret.getSolde());
    }
}
