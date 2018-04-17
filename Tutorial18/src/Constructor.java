class Machine {
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Constructor running!");
		
		name = "Latriss";
	}
	public Machine(String name){
		
		System.out.println("Second constructor running");
		this.name = name;
	}
	public Machine(String name, int code) {
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		//name of constructor has to be same name as class
		
		Machine machine2 = new Machine("Latriss");
		
		Machine machine3 = new Machine("Terrell", 43);
		
		
		
		

	}

}
