package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> { 

}
