package services;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.ChargeStation;
import domain.Charger;
import domain.ChargerType;
import domain.GeoLocation;
import domain.Supplier;
import repository.ChargeStationRepository;
import repository.ChargerRepository;
import repository.ChargerTypeRepository;
import repository.SupplierRepository;

@RestController
@RequestMapping("/chargestations")
public class ChargeStationRestController {

	private final ChargeStationRepository chargeStationRepository;
	private final ChargerRepository chargerRepository;
	private final ChargerTypeRepository chargerTypeRepository;
	private final SupplierRepository supplierRepository;

	
	public ChargeStationRestController(ChargeStationRepository chargeStationRepository, 
			ChargerRepository chargerRepository,
			ChargerTypeRepository chargerTypeRepository,
			SupplierRepository supplierRepository) {
		this.chargeStationRepository = chargeStationRepository;
		this.chargerRepository = chargerRepository;
		this.supplierRepository = supplierRepository;
		this.chargerTypeRepository = chargerTypeRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	Collection<ChargeStation> readChargeStations(@PathVariable String name) {
		
		Supplier s = new Supplier("Tesla");
		supplierRepository.save(s);
		
		ChargerType ct = new ChargerType("Teslas charger type A");
		chargerTypeRepository.save(ct);
		
		ArrayList<ChargerType> tl = new ArrayList<ChargerType>();
		tl.add(ct);
		Charger c = new Charger(tl);
		chargerRepository.save(c);
		
		ArrayList<Charger> sl = new ArrayList<Charger>();
		sl.add(c);
		
		chargeStationRepository.save(new ChargeStation(s, new GeoLocation(11.0, 12.0), sl));
				
		return this.chargeStationRepository.findAll();
	}
}
