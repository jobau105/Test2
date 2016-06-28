package Clog2;

import java.io.IOException;
import java.util.Scanner;

public class Input {

	static Scanner scanner = new Scanner(System.in);
	public static String inputString;
	public static int inputInt;
	
	public Input(){
	}
	public static void waitForUserInputInt()throws IOException{
		inputString = scanner.nextLine();
		inputInt = Integer.parseInt(inputString);
		checkUserInput();
	}
	public static void waitForUserInputPath()throws IOException{
		System.out.println("Enter path to read file from:");
		inputString = scanner.nextLine();
		FileWriterReaderList.pathInput = inputString;
	}
	public static void checkUserInput()throws IOException{
		if (inputInt == 1){PersonList.fillPersonListNew();}
		if (inputInt == 2){searchUserKeyword();}
		if (inputInt == 3){readClog();}
		if (inputInt == 4){PathFinder.saveClog();}
		if (inputInt == 5){System.out.println();return;}return;
	}
	public static void searchUserKeyword(){
		System.out.println("Enter Keyword:");
		Keyword.askForKeyword();
		PersonList.printKeywordPersonList();
	}
	public static void readClog()throws IOException{
		waitForUserInputPath();
		FileWriterReaderList.readFileList();
		FileWriterReaderList.repackageInPerson();
	}
	////////kjsgkjsgxc
}
