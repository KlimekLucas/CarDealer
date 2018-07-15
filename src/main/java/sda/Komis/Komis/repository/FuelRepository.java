package sda.Komis.Komis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.Komis.Komis.model.Fuel;


public interface FuelRepository extends CrudRepository<Fuel,Long> {
}
