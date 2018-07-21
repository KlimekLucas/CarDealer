package sda.Komis.Komis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.Komis.Komis.model.Fuel;
import sda.Komis.Komis.model.Manufacturer;

import javax.persistence.SecondaryTable;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer,Long> {
    Set<Manufacturer> findAll();
}
