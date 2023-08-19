import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PetShopInterface {
    public static void main(String[] args)  throws Exception {
        Scanner leitor= new Scanner(System.in);
        InventarioDeServicos inventario = new InventarioDeServicos();
        int opcao;
        Opcao opcaoMenu = null;
        Servico servico;
        /* Inicialização das variaveis que serão utilizadas para o funcionamento do programa

           O programa funciona com 4 opcões: Banho, Tosa, Hotel para Pets e Sair
           cada um desses serviços é registrado no inventario após ser criado

           Eu criei um método para criar os servicos, entao quando esse metodo é chamado, ele pede os dados necessários e cria o serviço escolhido pelo usuario

           após registrar cada serviço, o programa retorna pro menu principal com as opcoes novamente

           Quando a opçao é sair entende-se que é fim do espediente e emite o relatorio de todas as vendas registradas no inventario

         */
        System.out.println("---------- Bem Vindo ao PetShop!!! ----------");
        do {
            try {
                System.out.println("Escolha qual tipo de servico você deseja realizar: \n 1. Banho\n 2. Tosa\n 3. Hotel para Pets\n 5. Sair");
                opcao = leitor.nextInt();
                leitor.nextLine();
                if(opcao==4 || opcao>5 || opcao<0){
                    // Se a opcao não for uma das 4, lança a exceçao de opcao inválida e o programa fecha.
                    throw new InputMismatchException("Opcao invalida");
                }
            }catch (InputMismatchException w) {
                System.out.println(w.getMessage());
                opcao = 5;
                // Opcao agora = Sair
            }

            for (Opcao opcaoList : Opcao.values()) {
                // Este laço foi feito para relacionar a opcao digitada pelo usuario, com a classe de Enum Opcao
                if (opcao == opcaoList.getOpcao())
                    opcaoMenu = opcaoList;
            }
            if(opcaoMenu != Opcao.Sair || opcaoMenu == null) {
                // se a variavel opcaoMenu for sair ou null, ela não executa o programa e nao registra os servicos
                try {
                    // Chamada do metodo criaServico()  com entrada da variavel opcaoMenu
                    servico = criaServico(opcaoMenu);
                    inventario.adicionaServico(servico);
                    //adiciona o servico ao inventario
                }catch (NullPointerException errror) {
                    System.out.println(errror.getMessage());
                }
            }

        }while (opcaoMenu != Opcao.Sair);
        System.out.println("---------- Fim ----------\n Imprimindo relatório do dia\n  Aguarde ...");
        System.out.println(inventario.relatorioDosServicos());
        // Fim do programa e imprime o relatorio de todos os servicos registrados
        leitor.close();
    }
    public static Servico criaServico(Opcao opcao)throws Exception{
        // Metodo criado para criar um Servico, com os dados informados pelo usuario
        Scanner leitor= new Scanner(System.in);
        Servico servico = null;
        System.out.println("Digite o tamanho do seu Pet ('P'/ 'M'/ 'G')");
        char tamanho= leitor.next().charAt(0);
        leitor.nextLine();
        System.out.println("Qual o tamanho do pelo do seu Pet? ('curto', 'medio' ou 'longo')");
        String pelo = leitor.nextLine();
        String codigo= tamanho + pelo+ LocalDate.now();
        switch (opcao){
            case Banho:
                 servico= new Banho(tamanho, pelo, codigo);
                break;
            case Tosa:
                 servico = new Tosa(tamanho,pelo,codigo);
                break;
            case Hotel:
                System.out.println("Quantas Horas você deseja reservar? ");
                int Hora= leitor.nextInt();
                 servico= new Hotelzinho(tamanho, pelo, codigo,Hora);
                break;
            default:
                System.out.println("Serviço não encontrado");
        }
        System.out.println("Serviço registrado: "+ servico.getCodigo()+" Valor: R$"+ servico.getPreco());
        return servico;
    }
}