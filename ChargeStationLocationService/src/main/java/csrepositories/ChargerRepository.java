package csrepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import csdomain.Charger;

@Repository
public interface ChargerRepository extends JpaRepository <Charger, Long> {

}

	