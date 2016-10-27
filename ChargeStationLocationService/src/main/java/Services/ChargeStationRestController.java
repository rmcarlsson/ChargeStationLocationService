package Services;

import java.util.Collection;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.ChangeStation;
import repository.ChargeStationRepository;

@RestController
@RequestMapping("/chargestations")
public class ChargeStationRestController {

	private final ChargeStationRepository chargeStationRepository;

	
	public ChargeStationRestController(ChargeStationRepository chargeStationRepository) {
		this.chargeStationRepository = chargeStationRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	Collection<ChangeStation> readChargeStations(@PathVariable String name) {
		return this.chargeStationRepository.findByName(name);
	}
}
