public enum Pelo {
    curto("curto"), medio("medio"), longo("longo");
    private String pelinho;
    Pelo(String pelinho){
        this.pelinho=pelinho;
    }

    public String getPelinho() {
        return pelinho;
    }
}
