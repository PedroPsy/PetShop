public enum Opcao {
    Banho(1), Tosa(2), Hotel(3), Sair(5);

    private int opcao;

    public int getOpcao() {
        return opcao;
    }

    Opcao(int opcao){
        this.opcao= opcao;
    }
}
