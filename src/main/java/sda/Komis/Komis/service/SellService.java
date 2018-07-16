package sda.Komis.Komis.service;

import org.springframework.stereotype.Service;
import sda.Komis.Komis.dto.SellDto;
import sda.Komis.Komis.model.Sell;

import java.text.ParseException;
import java.util.Set;


public interface SellService {
      Sell addSell(SellDto sellVehicle) throws ParseException;
      Set<Sell> getAllSold();
}
