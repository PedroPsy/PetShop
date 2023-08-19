
public class Tosa extends Servico {

    public Tosa(char tamanhoAnimal, String tamanhoPelo, String codigo) throws Exception {
        super(tamanhoAnimal, tamanhoPelo, codigo);
        preco= calculaPreco();
    }

    @Override
    public String toString() {
        return "Tosa " +
                " preco = \t" + preco + " Codigo \t "+ getCodigo()+  " Data \t" + getData();
    }

    @Override
    public double calculaPreco() {
        double valorTosa=0.0;
        if(getTamanhoAnimal() == 'P')
            valorTosa=22.0;
        else if (getTamanhoAnimal() == 'M') {
            valorTosa = 30.0;
        }
        else
            valorTosa=40.0;
        return valorTosa;
    }
}
