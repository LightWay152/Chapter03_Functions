package roles.functions;

public class Role03_OneLevelOfAbstractionPerFunction {
	
	private static void learnJava() {
		System.out.println("1. Core Java");
		System.out.println("2. Java JDBC");
		System.out.println("3. Hibernate");
		System.out.println("4. Spring");
		System.out.println("5. Struts");
	}

	private static void learnDatabase() {
		System.out.println("1. My SQL");
		System.out.println("2. SQL Server");
		System.out.println("3. Oracle");
	}
	
	public static void main(String[] args) {
		learnWeb();
		learnDatabase();
		learnJava();		
	}

	private static void learnWeb() {
		System.out.println("1. HTML");
		System.out.println("2. CSS");
		System.out.println("3. JS");
	}

}
