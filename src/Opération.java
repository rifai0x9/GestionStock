import java.util.Date;


public class Opération {
	
	private Produit p;
	private String op;
	private Date date;
	private int qt;
	
	public Opération(Produit p, String op, Date date, int qt) {
		super();
		this.p = p;
		this.op = op;
		this.date = date;
		this.qt = qt;
	}

	public Produit getProduit() {
		return p;
	}

	public String getOperation() {
		return op;
	}

	public Date getDate() {
		return date;
	}

	public int getQt() {
		return qt;
	}
	
	public void print() {
		System.out.println(p.getLibelle()+"\t\t\t" + op + "\t\t" + date + "\t\t" + qt);
	}
	
}
