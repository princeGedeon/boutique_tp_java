import javax.lang.model.util.ElementScanner6;

public class Test{
    static Input input=new Input();
    public static void main(String[] ars){
        //Initialisation
        Magazin magazin=new Magazin();
        Boolean continuer=true;
        int tmp=0;
        int n=0;

        //Mon menu
        do{
            int action=menu();

            //Action
            switch(action){
                case 1:
                magazin.afficher_bilan();
                input.input_with_label_string("Voulez-vous continuer?....(Tapez sur une touche)");
                break;

                case 2:
                System.out.println("Ajout d'un produit");
                System.out.println("Veuillez entrez les renseignements pour un produit");
                magazin.ajouterProduit(input.input_with_label_string("nom"), input.input_with_label_double("Prix d'achat"), input.input_with_label_double("Prix de vente"));
                input.input_with_label_string("Voulez-vous continuer?....(Tapez sur une touche)");
                break;
                
                case 3:
                System.out.println("Acheter produit");
                tmp=input.input_with_label_int("Reference produit a acheter");
                n=input.input_with_label_int("Nombre exemplaire");
                if (magazin.acheterProduit(tmp, n))
                {
                    System.out.println("Opération réussi!!!!!");
                }
                else{
                    System.out.println("Opération échoué!!!!!");
                }
                System.out.println("Votre Solde actuel est : "+magazin.get_solde());
                input.input_with_label_string("Voulez-vous continuer?....(Tapez sur une touche)");
                break;

                case 4:
                System.out.println("Vendre produit");
                tmp=input.input_with_label_int("Reference produit a acheter");
                n=input.input_with_label_int("Nombre exemplaire");
                if (magazin.acheterProduit(tmp, n))
                {
                    System.out.println("Opération réussi!!!!!");
                }
                else{
                    System.out.println("Opération échoué!!!!!");
                }
                System.out.println("Votre Solde actuel est : "+magazin.get_solde());
                input.input_with_label_string("Voulez-vous continuer?....(Tapez sur une touche)");
                break;

                case 5:
                System.out.println("Votre solde est : "+magazin.get_solde());
                break;

                case 6:
                System.out.println("Voir ma liste de produit.");
                magazin.afficher_stock();
                break;

                case 7:
                System.out.println("Au revoir Monsieur");
                continuer=false;
                
                break;

                default:
                System.out.println("Commande invalide");
            }







        }while(continuer);

       

       

        
}
static public int menu(){
    System.out.println("|====**************MON MENU**************======|");
    System.out.println("1--Obtenir Bilan de mon magazin");
    System.out.println("2--Ajouter nouveau produit");
    System.out.println("3--Acheter Produit");
    System.out.println("4--Vendre Produit");
    System.out.println("5--Connaitre mon solde");
    System.out.println("6-Avoir la liste de mes articles");
    System.out.println("7--Quitter");
    return input.input_number();

}

}