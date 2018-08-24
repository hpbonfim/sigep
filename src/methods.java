/*
As informações básicas de um Empreendedor:
nome (com no máximo 30 caracteres),
cpf (com o formato YYY.YYY.YYY-YY) e
endereço (estado, cidade, bairro, rua, número
e complemento).

O sistema também deve armazenar todas as ideias de negócio que um empreendedor já teve,
armazenando para cada ideia de negócio:
a data em que o empreendedor a externou (no formato dd/mm/aaaa), se já foi implantada e
um descritivo textual da ideia (com no máximo 1000 caracteres).
Além disso, o sistema também deve armazenar uma referência para cada investidor
que investiu seu dinheiro no empreendedor em questão, bem como a quantidade de dinheiro investida
e a espécie do investimento (dinheiro, ouro, prata ou bronze);
 */


public interface methods {

    void setNome(String nome);
    String getNome();
    void setCpf(String cpf);
    String getCpf();

    void setEstado(String estado);
    String getEstado();
    void setCidade(String cidade);
    String getCidade();
    void setBairro(String bairro);
    String getBairro();
    void setRua(String rua);
    String getRua();
    void setNumero(int numero);
    double getNumero();
    void setComplemento(String complemento);
    String getComplemento();

    void setTituloIdeia(String titulo);
    String getTituloIdeia();
    void setDataCriacao(String dataCriacao);
    String getDataCriacao();
    void setDescricao(String descricao);
    String getDescricao();

    void setTipoInvestimento(String tipoInvestimento);
    String getTipoInvestimento();
    void setQuantidadeInvestido(double quantidade);
    double getQuantidadeInvestido();



}
