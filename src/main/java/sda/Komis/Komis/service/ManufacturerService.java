package sda.Komis.Komis.service;

import sda.Komis.Komis.model.Manufacturer;
import sda.Komis.Komis.model.Worker;

import java.util.Set;

public interface ManufacturerService  {
    Set<Manufacturer> findAll();
}
