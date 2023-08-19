import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

public abstract class Servico {
    private LocalDate data;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    private char tamanhoAnimal;
    private String tamanhoPelo;
    protected double preco;
    public abstract double calculaPreco();

    public  Servico(char tamanhoAnimal, String tamanhoPelo, String codigo) throws Exception {
        data = LocalDate.now();
        this.tamanhoAnimal = testaTamanho(tamanhoAnimal);
        this.tamanhoPelo = testaPelo(tamanhoPelo);
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public  String testaPelo(String tamanhoPelo) throws Exception {
        String pelo = tamanhoPelo;
        // Estou usando a variavel pelo para verificar se a string tamanhoPelo, existe no enum Pelo
        for(Pelo j: Pelo.values()){
            if(j.getPelinho().equals(tamanhoPelo))
                pelo= j.getPelinho();
        }
        if(pelo.equals(null))
            throw new Exception("TAMANHO DO PELO NÃO É VÁLIDO");
        // Se o valor de pelo, nao foi atualizado, ele nao existe no enum, logo cai na exceção
        return pelo;
    }
    public char testaTamanho(char tamanhoAnimal) throws Exception {
        char tam= 'n';
        // Estou usando essa variavel para testar se o que foi dado de entrada no char tamanhoAnimal, existe no enum Tamanho
        for ( Tamanho i: Tamanho.values()){
            if(i.getTamanho() == tamanhoAnimal)
                tam = i.getTamanho();
        }
        if(tam == 'n')
            throw new Exception("TAMANHO DO ANIMAL NÃO É VÁLIDO");
        // Se a variavel não existe no enum ela nao foi atualizada, logo não existe e cai na exceçao
        return tam;
    }


    public String getTamanhoPelo() {
        return tamanhoPelo;
    }

    public char getTamanhoAnimal() {
        return tamanhoAnimal;
    }

    public LocalDate getData() {
        return data;
    }
}
