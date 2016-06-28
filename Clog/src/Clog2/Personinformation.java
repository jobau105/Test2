package Clog2;

import java.util.ArrayList;
import java.util.List;

public class Personinformation {

	public List<String> persoInfoList = new ArrayList<String>();

	public Personinformation(){
	}
	public  void addPersonInformation(String info){
		persoInfoList.add(info);
	}
	public int personInformationLength(){
		return persoInfoList.size();
	}
	public void printPersonInformation(){
		for(int i = 0; i < persoInfoList.size();i++){
		System.out.println(persoInfoList.get(i));}
	}
	public static void printPersonInformation1(List<String> persoInfoList){
		for(int i = 0; i < persoInfoList.size();i++){
		System.out.println(persoInfoList.get(i));}
	}
}
