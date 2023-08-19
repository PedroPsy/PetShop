public class Banho extends Servico{
    @Override
    public String toString() {
        return "Banho " +
                "preco = " + getPreco() + " Codigo "+ getCodigo()+  " Data: "+ getData();
    }

    public Banho(char tamanhoAnimal, String tamanhoPelo, String codigo) throws Exception {
        super(tamanhoAnimal, tamanhoPelo, codigo);
        this.preco = calculaPreco();
    }
    @Override
    public double calculaPreco(){
        double valor=0.0;
        switch(getTamanhoAnimal()){
            case 'P':
                valor = 20.0;
                break;
            case 'M':
                valor=30.0;
                break;
            case 'G':
                valor=40.0;
                break;
        }
        if(getTamanhoPelo().equals("medio"))
            valor+= 10.0;
        else if (getTamanhoPelo().equals("longo")) {
            valor+=20.0;
        }
        return valor;
    }
}
