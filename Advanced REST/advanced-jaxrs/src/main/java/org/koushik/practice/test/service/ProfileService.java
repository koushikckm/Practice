package org.koushik.practice.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.koushik.practice.test.database.DatabaseClient;
import org.koushik.practice.test.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClient.getProfiles();

	public ProfileService(){
		profiles.put("Koushik", new Profile(1L, "Koushik", "Koushik","S"));
		//profiles.put("koushik123", new Profile(2L, "koushik123", "koushik123","123"));
	}
	
	public List<Profile> getAllProfiles(){	
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName); 
	}
	
}
