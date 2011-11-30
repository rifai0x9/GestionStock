import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] argv) {
		
		int choix = -1;
		GestionStocke gs = new GestionStocke();
		Scanner sc = new Scanner(System.in);
		Produit p;
		String ref;
		
		//D�but:
		Menu.Print();
		while(choix != 6) {
			choix = Menu.getChoix();
			//Traitement
			switch(choix) {
			
				case 0:
					//Affichage du Menu:
					Menu.Print();
					break;
				
				
				
				case 1:
					//Ajouter un produit
					System.out.println("Ajout d'un nouveau produit:");
					p = new Produit();
					p.setAttr();
					gs.AjouterProduit(p);
					System.out.println("\n\nOp�ration Termin� avec succ�s !\n\n");
					p = null;
					break;
					
					
					
					
				case 2:
					//Achat
					System.out.println("Achat d'un Produit:");
					System.out.print("R�ference: ");
					ref = sc.next();
					p = gs.Chercher(ref);
					if(p != null) {
						System.out.print("Quantit� Achet�: ");
						int qtAchete = sc.nextInt();
						p.Achat(qtAchete);
						//Historique
						Historique.AjouterHistorique(new Op�ration(p, "ACH", new Date(), qtAchete));
						System.out.println("\n\nOp�ration Termin� avec succ�s !\n\n");
					} else {
						System.out.println("Alerte: Ce produit n'existe pas!");
					}
					
					//Lib�ration des variables de travail
					p = null;
					ref = null;
					break;
					
					
					
					
				case 3:
					//Vente
					System.out.println("La Vente d'un Produit:");
					System.out.print("R�ference: ");
					ref = sc.next();
					if((p = gs.Chercher(ref)) != null) {
						System.out.print("Quantit� Achet�: ");
						int qtVendu = sc.nextInt();
						qtVendu = p.Vente(qtVendu);
						//Historique
						Historique.AjouterHistorique(new Op�ration(p, "VEN", new Date(), qtVendu));
						System.out.println("\n\nOp�ration Termin� avec succ�s !\n\n");
					} else {
						System.out.println("Alerte: Ce produit n'existe pas!");
					}
					
					//Lib�ration des variables de travail
					p = null;
					ref = null;
					
					break;
					
					
					
					
					
				case 4:
					//Etat de Stocke
					gs.EtatStock();
					System.out.println("\n\nOp�ration Termin� avec succ�s !\n\n");
					break;
					
					
					
					
				case 5:
					//Historique des op�rations
					Historique.Print();
					System.out.println("\n\nOp�ration Termin� avec succ�s !\n\n");
					break;	
					
					
					
				case 6:
					System.out.println("\nA Bient�t !\n\n");
					System.exit(0);
					break;
			}
		} 
	}
}
