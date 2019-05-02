package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="css")
public class count1 {

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	private  Integer countFast;
	private  Integer countSlow;
	
	
	
	
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
