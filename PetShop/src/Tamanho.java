public enum Tamanho  {
    pequeno('P'), medio('M'), grande('G');
    private char tamanho;

    public char getTamanho() {
        return tamanho;
    }

    Tamanho(char tamanho){
        this.tamanho = tamanho;
    }
}
