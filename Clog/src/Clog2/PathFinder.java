package Clog2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PathFinder {

	public static Scanner scanner = new Scanner(System.in);
	public static String pathInput;
	
	public PathFinder(){
	}
	public static void saveClog()throws IOException{
		FileWriterReaderList.fileList.clear();
		devidePersonList();
		FileWriterReaderList.writeFileList();
	}
	public static void devidePersonList() throws IOException{
		List<Person> tempPersonList = PersonList.personList;
		for(int i = 0; i < tempPersonList.size(); i++){
		Person tempPerson = tempPersonList.get(i);
		saveToFile(tempPerson);}
	}
	public static void saveToFile(Person tempPerson)throws IOException{
		Personinformation tempPersoInfo = tempPerson.persoinfo;
		List<String> tempPersoInfoList = tempPersoInfo.persoInfoList;
		for(int i = 0; i < tempPersoInfoList.size(); i++){
		String tempPersonInfo = tempPersoInfoList.get(i);
		FileWriterReaderList.addToFileList(tempPersonInfo);}
	}
}
