package tp41;

public class pointcol extends Point{
	
	private String couleur ;
	
	pointcol(){
		super();
		this.couleur = "";
		
	}
	pointcol(String c,double a,double b){
		super(a,b);
		this.couleur=c;
		
	}
	
	void setCouleur(String c) {
		this.couleur = c ;
	}
	
	void affiche () {
		super.affiche();
		System.out.println("le couleur : "+this.couleur);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
