package corn.springcore.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsInSpring {
	private String eName;
	private List<Integer> phone;
	private Set<String> address;
	private Map<String, String> cources;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public List<Integer> getPhone() {
		return phone;
	}
	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCources() {
		return cources;
	}
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	
		
	public CollectionsInSpring() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollectionsInSpring(String eName, List<Integer> phone, Set<String> address, Map<String, String> cources) {
		super();
		this.eName = eName;
		this.phone = phone;
		this.address = address;
		this.cources = cources;
	}
	
	
	

}
