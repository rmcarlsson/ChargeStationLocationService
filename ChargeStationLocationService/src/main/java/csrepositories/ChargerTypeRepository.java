package csrepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import csdomain.ChargerType;

@Repository
public interface ChargerTypeRepository extends JpaRepository <ChargerType, Long> {

}
