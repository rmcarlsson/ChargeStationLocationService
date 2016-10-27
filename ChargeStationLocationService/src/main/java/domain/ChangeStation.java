package domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ChangeStation {
	
	  @Id
	  @GeneratedValue
	  private Long id;
	  
	  @OneToOne
	  private GeoLocation location;
	  
	  private String name;
  
	  /**
	 * @return the location
	 */
	public GeoLocation getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(GeoLocation location) {
		this.location = location;
	}

	/**
	 * @return the owner
	 */
	public Supplier getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Supplier owner) {
		this.owner = owner;
	}

	@ManyToOne
	  private Supplier owner;
	  
	  public ChangeStation(Supplier aOwner, GeoLocation aLocation)
	  {
		  owner = aOwner;
		  location = aLocation;
	  }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
