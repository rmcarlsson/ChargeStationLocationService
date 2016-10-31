package repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.ChargeStation;

public interface ChargeStationRepository  extends JpaRepository<ChargeStation, Long> {
	Collection<ChargeStation> findByName(String name);
}
