
public class GestionStocke {

	private Produit[] produits;
	private int taille;
	private int index;
	
	public GestionStocke() {
		index = 0;
		taille = 4;
		produits = new Produit[taille];
	}
	
	public void AjouterProduit(Produit p) {
		if(index + 1 > taille) {
			taille *= 2;
			Produit[] tmp = new Produit[taille];
			produits = tmp;
		}
		if(Chercher(p.getCode()) == null)
			produits[index++] = p;
		else
			System.out.println("Ce Produit existe déjà !!");
	}
	
	public void EtatStock() {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Ref\t\t+\tLibellé\t\t\t+\tQuantité\t\t");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		for(int i = 0; i < index; i++) {
			System.out.println(produits[i].getCode()+"\t\t" + produits[i].getLibelle() + "\t\t\t\t" + produits[i].getQtStock());
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public Produit Chercher(String ref) {
		for(int i = 0; i < index; i++)
			if(produits[i].getCode().equals(ref)) return produits[i];
		return null;
	}
	
}
