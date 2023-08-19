public class Hotelzinho extends Servico{
    private int qtdeDeHoras;

    public Hotelzinho(char tamanhoAnimal, String tamanhoPelo, String codigo, int qtdeDeHoras) throws Exception {
        super(tamanhoAnimal, tamanhoPelo, codigo);
        this.qtdeDeHoras = qtdeDeHoras;
        preco = calculaPreco();
    }

    @Override
    public String toString() {
        return "Hotelzinho " + " Quantidade De Horas= " + qtdeDeHoras + "Valor pago: " + getPreco()+ " Codigo "+ getCodigo()+  " Data: " + getData();
    }

    public int getQtdeDeHoras() {
        return qtdeDeHoras;
    }

    @Override
    public double calculaPreco() {
        double valorPorHora=0.0;
        if(getTamanhoAnimal() == 'P')
            valorPorHora=12.0;
        else if (getTamanhoAnimal() == 'M') {
            valorPorHora= 18.0;
        }
        else
            valorPorHora= 25.0;
        return valorPorHora*getQtdeDeHoras();
    }
}
