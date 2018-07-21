package sda.Komis.Komis.service;

import org.springframework.stereotype.Service;
import sda.Komis.Komis.model.Fuel;
import sda.Komis.Komis.repository.FuelRepository;

import java.util.Set;

@Service
public class DefaultFuelService implements FuelService {

    private final FuelRepository fuelRepository;

    public DefaultFuelService(FuelRepository fuelRepository) {
        this.fuelRepository = fuelRepository;
    }

    @Override
    public Set<Fuel> findAll() {
    Set<Fuel> fuels = (Set<Fuel>) fuelRepository.findAll();
        return fuels;
    }
}
