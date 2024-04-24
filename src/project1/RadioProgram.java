package project1;

public class RadioProgram extends Program implements Comparable {
	
	String radiofrequency;
	
	private String turn;
	
	public RadioProgram(String name) {
		
		super(name);
		
	}
	
	public RadioProgram(String name, int minutes) {
		
		super(name, minutes);
		
	}
	
	public RadioProgram(String name, int minutes, String presName, String presTitle, int presAge) {
		
		super(name, minutes, presName, presTitle, presAge);
		
	}
	
	public RadioProgram(String name, int minutes, String presName, String presTitle, int presAge, String radiofrequency) {
		
		super(name, minutes, presName, presTitle, presAge);
		
		this.radiofrequency=radiofrequency;
		
	}
	
	public RadioProgram(String name, int minutes, String presName, String presTitle, int presAge, String radiofrequency, String turn) {
		
		this(name, minutes, presName, presTitle, presAge, radiofrequency);
		
		setTurn(turn);
		
	}
	
	public String getTurn() {
		
		return turn;
		
	}
	
	public void setTurn(String turn) {
		
		if(!turn.equalsIgnoreCase("matutino") && !turn.equalsIgnoreCase("vespertino") && !turn.equalsIgnoreCase("nocturno")) {
			
			turn="matutino";
			
		}
		
		this.turn=turn;
		
	}
	
	public String toString() {
		
		String result=super.toString();
		
		if(!radiofrequency.equals(null)) {
			
			result+=". Frecuencia: "+radiofrequency;
			
		}
		
		if(!turn.equals(null)) {
			
			result+=". Horario: "+turn;
			
		}
		
		return result;
		
	}
	
	public int compareTo(Object o) {
		
		return this.getMinutes()-((RadioProgram)o).getMinutes();
		
	}
	
}