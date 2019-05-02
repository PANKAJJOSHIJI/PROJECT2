package business;

import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class count2 {
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	private  Integer countFast;
	private  Integer countSlow;
	/*public static Integer scount=0;
	public static  Integer fcount=0;*/
	
	
	
	public  Integer getCountFast() {
		return countFast;
	}
	
	public Integer getCountSlow() {
		return countSlow;
	}
	public void setCountFast(Integer countFast) {
		this.countFast = countFast;
	}
	public void setCountSlow(Integer countSlow) {
		this.countSlow = countSlow;
	}
	

}
