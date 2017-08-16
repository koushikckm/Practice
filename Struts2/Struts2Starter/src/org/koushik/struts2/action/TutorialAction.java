package org.koushik.struts2.action;

import org.koushik.struts2.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	private String language;
	
	public String execute(){
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		
		System.out.println(getLanguage());

		setBestTutorialSite(tutorialFinderService.getBestTutorialService(getLanguage()));
		
	
		return "success";
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}