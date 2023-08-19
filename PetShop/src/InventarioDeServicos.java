import java.util.ArrayList;
import java.util.List;

public class InventarioDeServicos {
    private List<Servico> iventario = new ArrayList<>();


    public double valorTotalDosServicos(){
        // Retorna o valor total de todos os servicos registrados
        double valor=0.0;
        for(Servico servico: iventario){
            valor+=servico.getPreco();
        }
        return valor;
    }
    public String relatorioDosServicos(){
        // Mostra o relatorio geral de todos os servicos registrados
        List <String> relatorio= new ArrayList<>();
        for(Servico servico: iventario){
            relatorio.add(servico.toString());
        }
        return relatorio.toString() + "Total de Vendas : " + valorTotalDosServicos();
    }
    public double valorServico(int posicao){
        // Retorna o valor de algum servico especifico, atraves da posicao na lista
        return iventario.get(posicao).getPreco();
    }

    public String decricaoServico(int posicao){
        // Retorna a descricao de um servico especifico, atraves da posicao na lista
        return iventario.get(posicao).toString();
    }
    public void adicionaServico(Servico servico){
        // Adiciona um servico
        iventario.add(servico);

    }
    public void removeServico(int posicao){
        // remove um servico pela posicao
        iventario.remove(posicao);
    }

    public List<Servico> getIventario() {
        return iventario;
    }

    public void removeServico(Servico servico){
        // remove servico pelo objeto servico
        iventario.remove(servico);
    }
}
