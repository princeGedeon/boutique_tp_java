public class Produit {

    String nom;
    double prix_achat;
    double prix_vente;
    int n_exemp;
    String description;

    Produit(String nom,double pa,double pv)
    {
        this.nom=nom;
        this.prix_vente=pv;
        this.prix_achat=pa;
        this.n_exemp=0;
        this.description="Pas de description";
    }
    
    //Getteur
    String get_nom(){
        return this.nom;
    }
    String get_description(){
        return this.description;
    }

    double get_prix_achat()
    {
        return this.prix_achat;
    }

    double get_prix_vente(){
        return this.prix_vente;
    }

    int get_n_exemple(){
        return this.n_exemp;
    }

    //Setteur
    void set_nom(String new_nom){
        this.nom=new_nom;
    }
    void set_description(String new_desc){
        this.nom=new_desc;
    }
    void set_prix_achat(double pa){
        this.prix_achat=pa;
    }
    void set_prix_vente(double pv){
        this.prix_vente=pv;
    }
    void set_n_exempl(int n){
        this.n_exemp=n;

    }
    
    void augmenter_exemplaire(int n){
        if (n>=0){
            this.n_exemp+=n;
        }
       
    }

    void diminuer_exemplaire(int n){
        if (n>=0){
            this.n_exemp-=n;
        }
       
    }

   //Afficheur
    void afficher_nom(){
        System.out.println(this.nom);
    }

    void afficher_n_exemp(){
        System.out.println(this.n_exemp);
    }

    void afficher_pa(){
        System.out.println(this.prix_achat);
    }

    void afficher_desc(){
        System.out.println(this.description);
    }
    
}
