public class Empreendedor{
    private String nome, cpf;
    protected int key;
    protected int contador = 0;

    Empreendedor(){
    }

    protected void incrementa(int contador){
        this.contador = contador;
    }
    protected void setKey(int chave){this.key = chave;}

    protected int getKey(){return this.key;}

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getCpf() {
        return this.cpf;
    }
}
