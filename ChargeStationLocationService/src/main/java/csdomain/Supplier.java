package csdomain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Supplier {
	
	  @Id
	  @GeneratedValue
	  private Long id;

	  private String companyName;

	 public Supplier(String aCompanyName) {
		 companyName = aCompanyName;
	 }
	  
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
