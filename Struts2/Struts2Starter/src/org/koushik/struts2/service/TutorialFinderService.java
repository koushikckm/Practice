package org.koushik.struts2.service;

public class TutorialFinderService {

	public String getBestTutorialService(String language){
		if(language.equals("java")){
			return "Language Found!! Java Brains!!";
		}
		else{
			return "Language not supported";
		}
	}
}
