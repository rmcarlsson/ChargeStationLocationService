package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ChargerType {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	
	@ManyToMany(mappedBy="chargerTypes") // non-owning side
	private Collection <ChargeStation> chargeStations; 
	
	public Collection<ChargeStation> getChargeStations() {
		return chargeStations;
	}

	public void setChargeStations(Collection<ChargeStation> chargeStations) {
		this.chargeStations = chargeStations;
	}

	public ChargerType(String aName)
	{
		setName(aName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
