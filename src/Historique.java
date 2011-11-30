
public class Historique {
	
	private static Opération[] opérations = new Opération[4];
	private static int index = 0;
	private static int taille = 4;
	
	public static void AjouterHistorique(Opération op) {
		if(index == taille) {
			taille *= 2;
			Opération[] tmp = new Opération[taille];
			opérations = tmp;
		}
		opérations[index++] = op;
	}
	
	public static void Print() {
		for(int i=0;i<96;i++) System.out.print("*");
		System.out.println("\nProduit\t\t+\tOP\t+\tDate\t\t\t\t+\tQuantité\t");
		for(int i=0;i<96;i++) System.out.print("*");
		System.out.println();
		for(int i=0;i<index;i++)
			opérations[i].print();
			//System.out.println(opérations[i].getProduit().getLibelle()+"\t\t" + opérations[i].getOperation() + "\t\t" + opérations[i].getDate() + "\t\t" + opérations[i].getOperation());
	}
	
}
