package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import csdomain.Supplier;
import csrepositories.ChargeStationRepository;
import csrepositories.ChargerRepository;
import csrepositories.ChargerTypeRepository;
import csrepositories.SupplierRepository;


//@EnableJpaRepositories(basePackages = "csrepositories")

@RestController
@RequestMapping("/{userId}/chargestations")
public class ChargeStationRestController {

	@Autowired
	private final ChargeStationRepository chargeStationRepository;
	@Autowired
	private final ChargerRepository chargerRepository;
	@Autowired
	private final ChargerTypeRepository chargerTypeRepository;
	@Autowired
	private final SupplierRepository supplierRepository;

	public ChargeStationRestController(ChargeStationRepository chargeStationRepository, 
			ChargerRepository chargerRepository,
			ChargerTypeRepository chargerTypeRepository,
			SupplierRepository supplierRepository) {
		this.chargeStationRepository = chargeStationRepository;
		this.chargerRepository = chargerRepository;
		this.chargerTypeRepository = chargerTypeRepository;
		this.supplierRepository = supplierRepository;

	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Supplier> readChargestations(@PathVariable String userId) {
		
//		Supplier s = new Supplier("Tesla");
//		supplierRepository.save(s);
//		
//		ChargerType ct = new ChargerType("Teslas charger type A");
//		chargerTypeRepository.save(ct);
//		
//		ArrayList<ChargerType> tl = new ArrayList<ChargerType>();
//		tl.add(ct);
//		Charger c = new Charger(tl);
//		chargerRepository.save(c);
//		
//		ArrayList<Charger> sl = new ArrayList<Charger>();
//		sl.add(c);
//		
//		chargeStationRepository.save(new ChargeStation(s, new GeoLocation(11.0, 12.0), sl));
				
		return this.supplierRepository.findAll();
	}
}

