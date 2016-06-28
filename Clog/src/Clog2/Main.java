package Clog2;

import java.io.IOException;

public class Main {

	public static PersonList personListManager = new PersonList();
	
	public static void main(String[] args) throws IOException{
		while(true){
		mainframe();}
	}
	public static void mainframe() throws IOException{
		hauptmenueErzeugen();
		Input.waitForUserInputInt();
	}
	public static void hauptmenueErzeugen(){
		System.out.println("1) Clog Eintrag erzeugen\n2) Clog ausgeben\n3) Clog laden\n4) Clog speichern\n5) Programm beenden");
	}
}
