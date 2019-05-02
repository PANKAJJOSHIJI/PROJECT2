package persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hashmap_map")
public class hashmapp { 
	@Id
	private String k;

	private String v;
	public String getK() {
		return k;
	}
	public void setK(String k) {
		this.k = k;
	}
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}

}
