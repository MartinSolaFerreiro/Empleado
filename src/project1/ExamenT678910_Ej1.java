package project1;

import java.util.*;

public class ExamenT678910_Ej1 {
	
	static Scanner key=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		RadioProgram[] radioProgs1=new RadioProgram[3];
		
		RadioProgram[] radioProgs2=new RadioProgram[3];
		
		for(int i=0; i<radioProgs1.length; i++) {
			
			String name=key.nextLine();
			
			int minutes=key.nextInt();
			
			key.nextLine();
			
			String presName=key.nextLine();
			
			String presTitle=key.nextLine();
			
			int presAge=key.nextInt();
			
			key.nextLine();
			
			String radiofreq=key.nextLine();
			
			String turn=key.nextLine();
			
			radioProgs1[i]=new RadioProgram(name, minutes, presName, presTitle, presAge, radiofreq, turn);
			
		}
		
		for(int i=0; i<radioProgs2.length; i++) {
			
			String name=key.nextLine();
			
			int minutes=key.nextInt();
			
			key.nextLine();
			
			String presName=key.nextLine();
			
			String presTitle=key.nextLine();
			
			int presAge=key.nextInt();
			
			key.nextLine();
			
			radioProgs2[i]=new RadioProgram(name, minutes, presName, presTitle, presAge);
			
		}
		
		for(int i=0; i<radioProgs1.length; i++) {
			
			System.out.println(radioProgs1[i].toString());
			
		}
		
		for(int i=0; i<radioProgs2.length; i++) {
			
			System.out.println(radioProgs2[i].toString());
			
		}
		
		Program.producer="Nuevaproc";
		
		for(int i=0; i<radioProgs1.length; i++) {
			
			System.out.println(radioProgs1[i].toString());
			
		}
		
		for(int i=0; i<radioProgs2.length; i++) {
			
			System.out.println(radioProgs2[i].toString());
			
		}
		
		Arrays.sort(radioProgs1, new Comparator() {
			
			public int compare(Object o1, Object o2) {
				
				return ((RadioProgram)o1).getName().compareToIgnoreCase(((RadioProgram)o2).getName());
				
			}
			
		});
		
	}
	
}