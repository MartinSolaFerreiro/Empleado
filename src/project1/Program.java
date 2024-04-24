package project1;

import java.util.*;

public class Program {
	
	static Scanner key=new Scanner(System.in);
	
	private String name;
	
	static String producer="Productis";
	
	private int minutes=0;
	
	Presenter presenter;
	
	public Program(String name) {
		
		setName(name);
		
	}
	
	public Program(String name, int minutes) {
		
		this(name);
		
		setMinutes(minutes);
		
	}
	
	public Program(String name, int minutes, String presName, String presTitle, int presAge) {
		
		this(name, minutes);
		
		presenter=new Presenter(presName, presTitle, presAge);
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String name) {
		
		while(name.equals("")) {
			
			System.out.println("El nombre no puede estar vacío");
			
			name=key.nextLine();
			
		}
		
		this.name=name;
		
	}
	
	public int getMinutes() {
		
		return minutes;
		
	}
	
	public void setMinutes(int minutes) {
		
		while(minutes<0) {
			
			System.out.println("Los minutos no pueden ser negativos");
			
			minutes=key.nextInt();
			
			key.nextLine();
			
		}
		
		this.minutes=minutes;
		
	}
	
	public String toString() {
		
		String result="Nombre del programa: "+name;
		
		if(minutes>0) {
			
			result+=". Duración: "+minutes+" minutos";
			
		}
		
		if(!presenter.equals(null)) {
			
			result+=". "+presenter.toString();
			
		}
		
		return result;
		
	}
	
	public boolean equals(Object o) {
		
		return this.name.equalsIgnoreCase(((Program)o).name) && this.presenter.equals(((Program)o).presenter);
		
	}
	
}