package Clog2;

import java.util.Scanner;

public class Keyword {

	public static Scanner scanner = new Scanner(System.in);
	public static String keyword;
	
	public Keyword(){
	}
	public static void askForKeyword(){
		keyword = scanner.nextLine();
	}
	
}
