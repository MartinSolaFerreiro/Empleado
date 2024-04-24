package project1;

import java.util.*;

public class Presenter {
	
	static Scanner key=new Scanner(System.in);
	
	private String name;
	
	private String title;
	
	private int age=18;
	
	public Presenter(String name) {
		
		setName(name);
		
	}
	
	public Presenter(String name, String title) {
		
		this(name);
		
		setTitle(title);
		
	}
	
	public Presenter(String name, int age) {
		
		this(name);
		
		setAge(age);
		
	}
	
	public Presenter(String name, String title, int age) {
		
		this(name, age);
		
		setTitle(title);
		
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
	
	public String getTitle() {
		
		return title;
		
	}
	
	public void setTitle(String title) {
		
		while(title.equals("")) {
			
			System.out.println("La titulación no puede estar vacía");
			
			title=key.nextLine();
			
		}
		
		this.title=title;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public void setAge(int age) {
		
		while(age<18) {
			
			System.out.println("La edad tiene que ser al menos 18");
			
			age=key.nextInt();
			
			key.nextLine();
			
		}
		
		this.age=age;
		
	}
	
	public String toString() {
		
		String result="Nombre del presentador: "+name;
		
		if(!title.equals(null)) {
			
			result+=". Titulación: "+title;
			
		}
		
		if(age>=18) {
			
			result+=". Edad: "+age;
			
		}
		
		return result;
		
	}
	
	public boolean equals(Object o) {
		
		return this.name.equalsIgnoreCase(((Presenter)o).name);
		
	}
	
}