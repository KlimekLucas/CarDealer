package sda.Komis.Komis.repository;

import org.springframework.data.repository.CrudRepository;
import sda.Komis.Komis.model.Sell;

import java.util.Set;

public interface SellingRepository extends CrudRepository<Sell, Long> {


    Set<Sell> getAllByIdIsNotNull();
}
