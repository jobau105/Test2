package Clog2;

import java.util.Scanner;

public class Person {

	private static String[] questions = {"Bitte Vornamen angeben: ","Bitte Nachnamen angeben: ","Bitte Wohnort angeben: ","Bitte Datum angeben: ",
										 "Bitte Titel angeben: ","Bitte Text angeben: ","Bitte Schlagwoerter eingeben: "};
	private static Scanner scanner = new Scanner(System.in);
	private static String scannedLine;
	public Personinformation persoinfo = new Personinformation();

	public Person(){
	}
	public void fillInfoNameToText(){
		for(int i = 0; i < 6; i++){
		System.out.println(questions[i]);
		scannedLine = scanner.nextLine();
		persoinfo.addPersonInformation(scannedLine);}
	}
	public void fillInfoKeywordsLoop(){
		while (scanner.hasNextLine()){
		scannedLine = scanner.nextLine();
		if(scannedLine.equalsIgnoreCase("exit"))
		{persoinfo.addPersonInformation("----------");return;}
		persoinfo.addPersonInformation(scannedLine);}
	}
	public void fillInfoFull(){
		fillInfoNameToText();
		System.out.println(questions[6]);
		fillInfoKeywordsLoop();
	}
	public void printPerson(){
		persoinfo.printPersonInformation();
	}
}

