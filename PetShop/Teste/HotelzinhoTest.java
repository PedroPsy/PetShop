import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelzinhoTest {
    @org.junit.jupiter.api.Test

    void calculaPreco() throws Exception {
        Hotelzinho hotel= new Hotelzinho('P', "curto", "Alorra", 1);
        assertEquals(1, hotel.getQtdeDeHoras());
        assertEquals(12.0, hotel.calculaPreco());


        Hotelzinho hotelM= new Hotelzinho('M', "curto", "Alorra", 2);
        assertEquals(2, hotelM.getQtdeDeHoras());
        assertEquals(36.0, hotelM.calculaPreco());

        Hotelzinho hotelG= new Hotelzinho('G', "longo", "Alorra", 2);
        assertEquals(2, hotelG.getQtdeDeHoras());
        assertEquals(50.0, hotelG.calculaPreco());

    }

}