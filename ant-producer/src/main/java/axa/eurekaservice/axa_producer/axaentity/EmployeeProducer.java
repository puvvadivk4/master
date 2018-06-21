package axa.eurekaservice.axa_producer.axaentity;

public class EmployeeProducer {
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public EmployeeProducer(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
