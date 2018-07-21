package sda.Komis.Komis.service;

import org.springframework.stereotype.Service;
import sda.Komis.Komis.model.Manufacturer;
import sda.Komis.Komis.repository.ManufacturerRepository;

import java.util.Set;

@Service
public class  DefaultManufacturerService implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public DefaultManufacturerService(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }


    @Override
    public Set<Manufacturer> findAll() {
       Set<Manufacturer> manufacturersList = manufacturerRepository.findAll();
       return manufacturersList;
    }

}
