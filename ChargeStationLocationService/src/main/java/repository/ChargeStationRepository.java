package repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.ChangeStation;

public interface ChargeStationRepository  extends JpaRepository<ChangeStation, Long> {
	Collection<ChangeStation> findByName(String name);
}
