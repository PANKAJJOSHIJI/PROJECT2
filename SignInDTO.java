package business;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SignInDTO {
	
	private Integer id;
	private String name;
	private String doubt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoubt() {
		return doubt;
	}
	public void setDoubt(String doubt) {
		this.doubt = doubt;
	}

	

}
