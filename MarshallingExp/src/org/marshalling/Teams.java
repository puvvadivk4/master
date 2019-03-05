package org.marshalling;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="XYZ")
public class Teams {

	
	private List<Team> myteams;

	public Teams(List<Team> teams) {
		
		this.myteams = teams;
	}
	
	public List<Team> getTeams() {
		return myteams;
	}

	public Teams() {
	
	}
	@XmlElement(name="MyTeam")
	public void setTeams(List<Team> teams) {
		this.myteams = teams;
	}
	
}
