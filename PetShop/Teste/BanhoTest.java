import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class BanhoTest {

    @org.junit.jupiter.api.Test
    void calculaPreco() throws Exception {
        Servico banhoTeste= new Banho('P', "curto", "codigo");
        assertEquals(20.0, banhoTeste.calculaPreco());
        assertEquals("curto", banhoTeste.getTamanhoPelo());
        assertEquals('P', banhoTeste.getTamanhoAnimal());

        Servico banhoMedio= new Banho('P', "medio", "codigo");
        assertEquals(30.0, banhoMedio.calculaPreco());

        Servico banhoGrande= new Banho('P', "longo", "codigo");
        assertEquals(40.0, banhoGrande.calculaPreco());


    }


}