package org.janjua.jerseyTest.messenger.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	private long id;
	private String firstName;
	private String lastName;
	private Date created;
	private String profileName;

	public Profile(){
		
	}
	public Profile(long id, String profileName, String firstName, String lastName){
		this.setId(id);
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setProfileName(profileName);
		this.created = new Date();
	}
	public Date getCreated() {
		return created;  
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	
}
