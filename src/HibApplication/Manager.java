package HibApplication;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlowerShopManager")
public class Manager {
	
	@Id
	int mid;
	String name;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}
	
	

}
