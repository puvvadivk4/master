package org.marshalling;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player {

	
	private int pid;
	
	
	private String pname;
	
	
	private int pscore;
	
	public int getPid() {
		return pid;
	}
	
	@XmlAttribute
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public Player(int pid, String pname, int pscore) {

		this.pid = pid;
		this.pname = pname;
		this.pscore = pscore;
	}
	
	@XmlElement
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPscore() {
		return pscore;
	}
	
	@XmlElement
	public void setPscore(int pscore) {
		this.pscore = pscore;
	}
	public Player(){

	}
}
