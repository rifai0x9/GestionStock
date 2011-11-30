import java.util.Scanner;


public class Produit {

	private String code;
	private String libelle;
	private float pu;
	private int qtStock;
	
	public Produit() {
		super();
	}
	
	public Produit(String code, String libelle, float pu, int qtStock) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.pu = pu;
		this.qtStock = qtStock;
	}
	
	public void Achat(int qtAchete) {
		this.qtStock += qtAchete;
	}
	
	public int Vente(int qtVendu) {
		if(qtVendu > this.qtStock) {
			System.out.println("Alerte: Quantité en Stock insuffisante!!");
			qtVendu = this.qtStock;
		}
		this.qtStock -= qtVendu;
		return qtVendu;
	}
	
	public void setAttr() {
		Scanner sc = new Scanner(System.in);
		//Code:
		System.out.print("Code: ");
		while((this.code = sc.next()).length() != 10) {
			System.out.println("La taille devera étre egal à 10 caractères");
			System.out.print("Code: ");
		}
		//this.code = this.code.substring(0, 10);
		System.out.print("Libellé: ");
		this.libelle = sc.next();
		System.out.print("Prix Unitaire: ");
		this.pu = sc.nextFloat();
		System.out.print("Quantité en Stock: ");
		this.qtStock = sc.nextInt();
	}

	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}

	public float getPu() {
		return pu;
	}

	public int getQtStock() {
		return qtStock;
	}
	
	
	
}
