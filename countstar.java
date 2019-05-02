package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="starcountt")
public class countstar {
	@Id
	
	private Integer star;

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}
	
}
