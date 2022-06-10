import java.util.ArrayList;
import java.util.List;

public class Magazin {
    double solde;
    List<Produit> stock;


    Magazin(){
        this.solde=50000;
        this.stock=new ArrayList<>();
    }

    public void ajouterProduit(String nom,double prixAchat,double prixVente){
        Produit produit=new Produit(nom,prixAchat,prixVente);

        stock.add(produit);

    }

    public boolean acheterProduit(int referenceProduit,int nombreExemplaires){
        if (referenceProduit<=(stock.size()-1))
        {
            this.stock.get(referenceProduit).augmenter_exemplaire(nombreExemplaires);
            this.solde-=(stock.get(referenceProduit).get_prix_achat()*nombreExemplaires);
        
        
            if (this.solde<0){
                this.solde=0;
            }
            return true;
        }
      else{
          return false;
      }
    }

    public boolean vendreProduit(int referenceProduit,int nombreExemplaires){
        if (referenceProduit<=(stock.size()-1)){
            stock.get(referenceProduit).diminuer_exemplaire(nombreExemplaires);
            this.solde+=(stock.get(nombreExemplaires).get_prix_vente()*nombreExemplaires);
            return true;
        }
        else{
            return false;
        }
    }

    //Getteur
    double get_solde(){
        return this.solde;
    }

    List<Produit> get_stock(){
        return this.stock;
    }

    //Setteur
    void set_solde(double solde){
        this.solde=solde;
    }

    void set_stock(List<Produit> new_stock){
        this.stock=new_stock;
    }

    //Bilan
    void afficher_bilan(){
        System.out.println("-------------------BIENVENUE DANS MON MAGAZIN-------------------------------");
        System.out.println("Mon Solde :" + this.solde);
        System.out.println("Nombre de Produits dispo : "+this.stock.size());
        
        System.out.println("--Mes produits");
        this.afficher_stock();
    }
    


    void afficher_stock(){
        for (int i=0;i<=stock.size()-1;i++){

            System.out.println(this.stock.get(i).get_nom()+"------"+this.stock.get(i).get_n_exemple());
        }
    }    
}
