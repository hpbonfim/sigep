public class Investidor {
    private String nome, tipoInvestimento;
    private double quantidadeInvestida;
    protected int key, contador = 0;

    Investidor(){
    }

    protected void incrementa(int contador){
        this.contador = contador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getTipoInvestimento() {
        return this.tipoInvestimento;
    }

    public void setQuantidadeInvestido(double quantidade) {
        this.quantidadeInvestida = quantidade;
    }

    public double getQuantidadeInvestido() {
        return this.quantidadeInvestida;
    }

    protected void setKey(int chave){this.key = chave;}

    protected int getKey(){return this.key;}

}
