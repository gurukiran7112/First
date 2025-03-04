package java_programs;

public class Bike extends vehicle {
	int stand;

	public Bike(int cc, float milage, int stand) {
		super(cc, milage);
		this.stand = stand;
	}

	public static void main(String[] args) {
		Bike activa = new Bike(125, 400, 2);
		Bike R15 = new Bike(500, 800, 3);
		System.out.println(activa.cc + "," + activa.milage + "," + activa.stand);
		System.out.println(R15.cc + "," + R15.milage + "," + R15.stand);

	}

}
