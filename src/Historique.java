
public class Historique {
	
	private static Op�ration[] op�rations = new Op�ration[4];
	private static int index = 0;
	private static int taille = 4;
	
	public static void AjouterHistorique(Op�ration op) {
		if(index == taille) {
			taille *= 2;
			Op�ration[] tmp = new Op�ration[taille];
			op�rations = tmp;
		}
		op�rations[index++] = op;
	}
	
	public static void Print() {
		for(int i=0;i<96;i++) System.out.print("*");
		System.out.println("\nProduit\t\t+\tOP\t+\tDate\t\t\t\t+\tQuantit�\t");
		for(int i=0;i<96;i++) System.out.print("*");
		System.out.println();
		for(int i=0;i<index;i++)
			op�rations[i].print();
			//System.out.println(op�rations[i].getProduit().getLibelle()+"\t\t" + op�rations[i].getOperation() + "\t\t" + op�rations[i].getDate() + "\t\t" + op�rations[i].getOperation());
	}
	
}
