package sda.Komis.Komis.service;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import sda.Komis.Komis.model.Client;
import sda.Komis.Komis.model.Sell;
import sda.Komis.Komis.model.Worker;
import sda.Komis.Komis.model.WorkersRoles;
import sda.Komis.Komis.repository.SellingRepository;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DefaultSellServiceTest {


    @Test
    public void addSell() throws Exception {



        Worker worker = mock(Worker.class);
        Sell sellTest = mock(Sell.class);
        // define return value for method getUniqueId()
        when(sellTest.getId()).thenReturn(Long.valueOf(1));
        when(sellTest.getClient()).thenReturn(new Client("jan", "kowalski", "kopernika", "121212123", "12121"));
        when(sellTest.getAgreement()).thenReturn("agremeent");
        when(sellTest.getInvoice()).thenReturn("Invoice");
        when(sellTest.getPrice()).thenReturn(50000);
        when(sellTest.getWorker()).thenReturn(worker);
//        when(sellTest.getSellingDate()).thenReturn(new Date("21-21-21"));

        // use mock in test....
        assertEquals(sellTest.getId(), Long.valueOf(1));
        assertEquals(sellTest.getClient(), new Client("jan", "kowalski", "kopernika", "121212123", "12121"));
        assertEquals(sellTest.getAgreement(),"agremeent");
        assertEquals(sellTest.getPrice(), Integer.valueOf(50000));
        assertEquals(sellTest.getInvoice(),"Invoice");
        assertEquals(sellTest.getWorker(),worker);
    }

    @Test
    public void getAllSold() throws Exception {
        //TODO
    }

}

