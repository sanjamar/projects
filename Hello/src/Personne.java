
public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	
	
	//méthode constructeur1
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	
	//méthode constructeur2
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}



	//assesseurs

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	

	//méthodes demandée par client
	public void methode1() {
		System.out.println("Je suis dans la methode1.");
	}
	
	//méthodes demandée par client
	public String methode2(String x) {
		return x;
	}

	public String metode3(Personne p) {
		return p.toString();
	}
	
	public Personne methode4(Personne p) {
		return p;
	}
	
	public void methode5() {
		for(int i=0; i<5; i++) {
			System.out.println("Bonjour");
		}
			
	}
	
	public void methode6(int y ) {
		for(int i=0; i<y; i++) {
			System.out.println("BONJOUR");
		}
	}
	
	public void methode7() {
		int i=0;
		while(i<5) {
			System.out.println("Bonjour!!");
			i++;
		}
	}
	
	public void methode8(int z) {
		int i=0;
		while (i<z) {
			System.out.println("BONJOUR!!");
			i++;
		}
	}
	
	public void methode9(int k) {
		switch(k) {
		case 0: 
			System.out.println("Value of k is 0!");
			break;
		case 1: 
			System.out.println("Value of k is 1!");
			break;
		default: 
			System.out.println("The value of k is deifferent than 0 and 1!");
			break;
		
		}
	}

	//redéfinition de la méthode ToString
	@Override
	public String toString() {
		if (age != 0)
			return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		else
			return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
