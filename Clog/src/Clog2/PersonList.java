package Clog2;

import java.util.ArrayList;
import java.util.List;

public class PersonList{

	static List<Person> personList = new ArrayList<Person>();
	
	public PersonList(){
	}
	public static void fillPersonListNew(){
		Person person = new Person();
		person.fillInfoFull();
		personList.add(person);
	}
	public static void fillPersonListRead(Person person){
		personList.add(person);
	}
	public static void printPersonList(){
		Person tempPerson;
		for(int i = 0; i < personList.size(); i++){
		tempPerson = personList.get(i);
		tempPerson.printPerson();}
	}
	public static void printKeywordPersonList(){
		for(int i = 0; i < personList.size(); i++){
		Person tempPerson = personList.get(i);
		printKeywordPersonList1(tempPerson);}
	}
	public static void printKeywordPersonList1(Person person){
		Personinformation tempPersoninformation = person.persoinfo;
		List<String> tempKeywordList = tempPersoninformation.persoInfoList;
		printKeywordPersonList2(tempKeywordList);
	}
	public static void printKeywordPersonList2(List<String> tempKeywordList){
		String tempKeyword = Keyword.keyword;
		for(int i = 0; i < tempKeywordList.size(); i++){
		String tempListWord = tempKeywordList.get(i);
		if(tempListWord.equals(tempKeyword))
		{Personinformation.printPersonInformation1(tempKeywordList);break;}}
	}
}