import java.util.ArrayList;
import java.util.List;



public class TotalEntity {
	
	private int id;
	private String name;
	private List<String> lStrings;//=new ArrayList<String>();
	public TotalEntity(int id, String name ,List<String> list) {
		this.id=id;
		this.name=name;
		this.lStrings=list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getlStrings() {
		return lStrings;
	}
	public void setlStrings(List<String> lStrings) {
		this.lStrings = lStrings;
	}

}
