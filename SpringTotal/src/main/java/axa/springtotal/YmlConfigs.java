package axa.springtotal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties//(prefix="my")

public class YmlConfigs {
	/*//@Value("#{server.port}")
	private int server;
	private String name;

	@Value("${spring.profiles}")
	private String profile;

	public void setServer(int server) {
		this.server = server;
	}

	public int getServer() {
		
		return server;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/
	
	
	
	private List<String> servers = new ArrayList<String>();
	
	@Value("${server.port}")
	private String server;
	
	@Value("${spring.application.name}")
	private String name;
	
	@Value("${eurekaw.instance.hostname}")
	private String regTypr;
	
	
	
	public String getRegTypr() {
		return regTypr;
	}

	public void setRegTypr(String regTypr) {
		this.regTypr = regTypr;
	}
	
	
	
	
public String getName()
{
  return this.name;	
}

	public String getServer() {
		return this.server;
	}

	public List<String> getServers() {
		return this.servers;
	}

	
}
