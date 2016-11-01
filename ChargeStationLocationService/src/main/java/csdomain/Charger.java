package csdomain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Charger {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private ChargeStation chargeStation;
	
	@ManyToMany(targetEntity=csdomain.ChargerType.class) // Owning side
	private Collection<ChargerType> chargerTypes;
	
	public Collection<ChargerType> getChargerTypes() {
		return chargerTypes;
	}

	public void setChargerTypes(Collection<ChargerType> chargerTypes) {
		this.chargerTypes = chargerTypes;
	}

	public Charger(Collection<ChargerType> chargerTypesList)
	{
		chargerTypes = chargerTypesList;
	}
	
	
	
}
