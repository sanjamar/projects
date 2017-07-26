public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Bonjour Java!");
		
		Personne p1 = new Personne("ToTo", "Dupond", 25);
		System.out.println(p1);
		p1.setNom("test");
		System.out.println(p1);
		p1.methode1();
		
		Personne p2 = new Personne("Sweet", "Jane");
		System.out.println(p2);
		p2.setAge(35);
		System.out.println(p2);
		
		p2.methode5();
		p2.methode6(4);
		p2.methode7();
		p2.methode8(6);
		p2.methode9(1);
	}

}
