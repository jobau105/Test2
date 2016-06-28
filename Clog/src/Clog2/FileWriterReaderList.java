package Clog2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWriterReaderList {

	private static Path p;
	public static List<String> fileList = new ArrayList<String>();
	public static Scanner scanner = new Scanner(System.in);
	private static BufferedReader br;
	private static int count = 0;
	public static String pathInput;

	public FileWriterReaderList(){
	}
	public static void addToFileList(String personInfo){
		fileList.add(personInfo);
	}
	public static void writeFileList()throws IOException{
		System.out.println("Enter path to file you want to save your Clog to:");
		pathInput = scanner.nextLine();
		p = Paths.get(pathInput);
		Files.write(p, fileList);return;}
	public static void readFileList(){
		String line;
		try{br = new BufferedReader(new FileReader(pathInput));
		while ((line = br.readLine()) != null)
		{fileList.add(line);}}
		catch (IOException e){e.printStackTrace();}
	}
	public static void repackageInPerson(){
		for(int i = 0; i < fileList.size(); i++){
		Person person = new Person();
		addPersonToPersonList(person);
		PersonList.fillPersonListRead(person);}
	}
	public static void addPersonToPersonList(Person person){
		for(int j = count; j < fileList.size(); j++){
		String fileListEntry = fileList.get(j);count++;
		Personinformation personinfo = person.persoinfo;
		List<String> persoInfoList = personinfo.persoInfoList;
		persoInfoList.add(fileListEntry);
		if(fileListEntry.equals("----------")){break;}}
	}
}
