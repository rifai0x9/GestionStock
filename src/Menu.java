import java.util.Scanner;


public class Menu {
	
	private static int choix;
	
	public static void Print() {
		System.out.println("********************** Menu *********************");
		System.out.println("*\t\t\t\t\t\t*");
		System.out.println("*\t 1- Ajouter un Produit \t\t\t*");
		System.out.println("*\t 2- Achat \t\t\t\t*");
		System.out.println("*\t 3- Vente \t\t\t\t*");
		System.out.println("*\t 4- Etat de Stocke \t\t\t*");
		System.out.println("*\t 5- Historique des opérations \t\t*");
		System.out.println("*\t 6- Quitter \t\t\t\t*");
		System.out.println("*\t\t\t\t\t\t*");
		System.out.println("*************************************************");
	}
	
	public static int getChoix() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nTaper votre choix [1-6]: >> " );
		while(true) {
			choix = sc.nextInt();
			if(choix >= 0 && choix <= 6) break;
			System.out.println("Choix Incorrecte !!");
			System.out.print("Choix >> ");
		}
		return choix;
	}
	
}
