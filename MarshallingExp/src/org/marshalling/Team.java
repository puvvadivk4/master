package org.marshalling;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Team {
	public Team(int tid,String name, int score, List<Player> players) {
		this.tid=tid;
		this.tname = name;
		this.tscore = score;
		this.tplayers = players;
	}
	
	
	
	public int getTid() {
		return tid;
	}
	@XmlAttribute
	public void setTid(int tid) {
		this.tid = tid;
	}



	private int tid;
	
	
	
	private String tname;
	
	
	private int tscore;
	
	
	private List<Player> tplayers;
	
	public Team() {
		
	}
	public String getName() {
		return tname;
	}
	
	@XmlElement
	public void setName(String name) {
		this.tname = name;
	}
	public int getScore() {
		return tscore;
	}
	@XmlElement
	public void setScore(int score) {
		this.tscore = score;
	}
	public List<Player> getPlayers() {
		return tplayers;
	}
	@XmlElement(name="Myplayers")
	@XmlElementWrapper(name="Players")
	public void setPlayers(List<Player> players) {
		this.tplayers = players;
	}
}
