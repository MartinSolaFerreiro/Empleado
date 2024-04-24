package project1;

public class TVProgram extends Program {
	
	String plate;
	
	String channel;
	
	public TVProgram(String name) {
		
		super(name);
		
	}
	
	public TVProgram(String name, int minutes) {
		
		super(name, minutes);
		
	}
	
	public TVProgram(String name, int minutes, String presName, String presTitle, int presAge) {
		
		super(name, minutes, presName, presTitle, presAge);
		
	}
	
	public TVProgram(String name, int minutes, String presName, String presTitle, int presAge, String plate, String channel) {
		
		super(name, minutes, presName, presTitle, presAge);
		
		this.plate=plate;
		
		this.channel=channel;
		
	}
	
	public String toString() {
		
		String result=super.toString();
		
		if(!plate.equals(null)) {
			
			result+=". Plató: "+plate;
			
		}
		
		if(!channel.equals(null)) {
			
			result+=". Canal: "+channel;
			
		}
		
		return result;
		
	}
	
}