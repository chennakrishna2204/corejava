// added comment
public class Computer {

	// adding comment
//adding for git
	private Computer() {
		
	}
	
	private Computer(String ram) {
        }
	private String ram;
	private String memory;
	private boolean graphicCardEnabled;
	private boolean isBluetoothEnabled;
	
	
	
	
	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", memory=" + memory + ", graphicCardEnabled=" + graphicCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}





	public Computer(String ram, String memory, boolean graphicCardEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.memory = memory;
		this.graphicCardEnabled = graphicCardEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}





	public static class ComputerBuilder {
		
		private String ram;
		private String memory;
		private boolean graphicCardEnabled;
		private boolean isBluetoothEnabled;
		public ComputerBuilder(String ram, String memory) {
			super();
			this.ram = ram;
			this.memory = memory;
		}
		public String getRam() {
			return ram;
		}
		public void setRam(String ram) {
			this.ram = ram;
		}
		public String getMemory() {
			return memory;
		}
		public void setMemory(String memory) {
			this.memory = memory;
		}
		public boolean isGraphicCardEnabled() {
			return graphicCardEnabled;
		}
		public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
			this.graphicCardEnabled = graphicCardEnabled;
			return this;
		}
		public boolean isBluetoothEnabled() {
			return isBluetoothEnabled;
		}
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		
		
		public Computer build() {
			return new Computer(ram,memory,graphicCardEnabled,isBluetoothEnabled);
		}
		
		
	}
	
}
