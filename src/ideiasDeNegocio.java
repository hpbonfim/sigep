public class ideiasDeNegocio{
    private String titulo, dataCriacao, descricao;
    protected int contador = 1, key;

    ideiasDeNegocio(){
        setKey(0);
        setDescricao(null);
        setDataCriacao(null);
        setTituloIdeia(null);
    }

    protected void incrementa(int contador){
        this.contador = contador;
    }

    protected void setKey(int chave){this.key = chave;}

    public int getKey(){return this.key;}

    public void setTituloIdeia(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloIdeia() {
        return this.titulo;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void verificaData(){

    }

}
