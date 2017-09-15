package HibApplication;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FlowersShop {

	
	@Id
	int Flowerid;
	String flowerType;
	float sales;
	
	@OneToMany
	Collection<Manager> c = new ArrayList<Manager>(); 
	
	
	
	public Collection<Manager> getC() {
		return c;
	}
	public void setC(Collection<Manager> c) {
		this.c = c;
	}
	
	public FlowersShop(int flowerid, String flowerType, float sales,
			Collection<Manager> c) {
		super();
		Flowerid = flowerid;
		this.flowerType = flowerType;
		this.sales = sales;
		this.c = c;
	}
	public FlowersShop(int flowerid, String flowerType, float sales) {
		super();
		Flowerid = flowerid;
		this.flowerType = flowerType;
		this.sales = sales;
	}
	public int getFlowerid() {
		return Flowerid;
	}
	public void setFlowerid(int flowerid) {
		Flowerid = flowerid;
	}
	public String getFlowerType() {
		return flowerType;
	}
	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
	public float getSales() {
		return sales;
	}
	public void setSales(float sales) {
		this.sales = sales;
	}
	
	
}
