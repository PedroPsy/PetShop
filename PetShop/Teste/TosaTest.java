import static org.junit.jupiter.api.Assertions.*;

class TosaTest {
    @org.junit.jupiter.api.Test
    void calculaTosa() throws Exception {
        Servico  tosa= new Tosa('P', "curto", "hhahas");
        assertEquals(22.0, tosa.calculaPreco());

        Servico  tosaM= new Tosa('M', "curto", "hhahas");
        assertEquals(30.0, tosaM.calculaPreco());

        Servico  tosaG= new Tosa('G', "curto", "hhahas");
        assertEquals(40.0, tosaG.calculaPreco());

    }

}