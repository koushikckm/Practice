package org.koushik.practice.test.database;

import java.util.HashMap;
import java.util.Map;

import org.koushik.practice.test.model.Message;
import org.koushik.practice.test.model.Profile;

public class DatabaseClient {

	private static Map<Long ,Message> messages = new HashMap<>();
	private static Map<String ,Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
}
