package csrepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import csdomain.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository <Supplier, Long> { 

}
