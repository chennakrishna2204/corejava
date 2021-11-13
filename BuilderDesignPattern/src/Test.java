
public class Test {

	
	
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("4gb", "1tb").setBluetoothEnabled(true).build();
		
		System.out.println(computer.toString());
	}
}
