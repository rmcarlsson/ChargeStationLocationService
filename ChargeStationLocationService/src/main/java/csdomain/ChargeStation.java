package csdomain;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ChargeStation {
	
	  @Id
	  @GeneratedValue
	  private Long id;
	  
	  @OneToOne
	  private GeoLocation location;
	  
	  @OneToMany
	  private Collection<Charger> chargers;
	  
	  
	  public ChargeStation(Supplier aOwner, GeoLocation aLocation, Collection<Charger> chargers)
	  {
		  owner = aOwner;
		  location = aLocation;
		  this.chargers = chargers;
	  }

	  
	  public Collection<Charger> getChargers() {
		return chargers;
	}

	public void setChargers(Collection<Charger> chargers) {
		this.chargers = chargers;
	}

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
