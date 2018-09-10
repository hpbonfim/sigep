import javax.swing.*;

public class SIGEP {
    private int chave = 0;
    private int chave2 = 0;
    private int constante = 10;

    private Empreendedor empreendedor = new Empreendedor();
    private Empreendedor[] empreendedores = new Empreendedor[constante];

    private ideiasDeNegocio ideias1;
    private ideiasDeNegocio[] ideia1 = new ideiasDeNegocio[constante];

    private ideiasDeNegocio ideias2 ;
    private ideiasDeNegocio[] ideia2 = new ideiasDeNegocio[constante];

    private Investidor investidor;
    private Investidor[] investidores = new Investidor[constante];

    SIGEP() {
    }

    private boolean adicionarNovaIdeia(int key){
        ideias2 = new ideiasDeNegocio();
        String titulo, data, descricao;
            do {
                titulo = JOptionPane.showInputDialog(null, "Digite o Nome:");
            } while (titulo.equals("") || titulo.equals(" "));

            do {
                data = JOptionPane.showInputDialog(null, "Digite a Data de Criação:");
            } while (data.equals("") || data.equals(" "));

            do {
                descricao = JOptionPane.showInputDialog(null, "Digite a Descrição:");
            } while (descricao.equals("") || descricao.equals(" "));

            ideias2.incrementa(key);
            ideias2.setKey(key);
            ideias2.setTituloIdeia(titulo);
            ideias2.setDataCriacao(data);
            ideias2.setDescricao(descricao);

            ideia2[key] = ideias2;
            //ideias2.setKey(0);
            //ideia2[key] = ideias2;
            return false;
    }

    private void cadastrarInvestidor() {
        chave2++;
        String nome, tipoInvestimento, quantidadeInvestida;
        investidor = new Investidor();
            do {
                nome = JOptionPane.showInputDialog(null, "Digite o nome:");
            } while (nome.equals("") || nome.equals(" "));
            investidor.setNome(nome);

            do {
                tipoInvestimento = JOptionPane.showInputDialog(null, "Digite o tipo de investimento:" + "\n(Dinheiro, Cartao, Ouro, etc...)");
            }while(nome.equals("")||nome.equals(" "));
            investidor.setTipoInvestimento(tipoInvestimento);

            do {
                quantidadeInvestida = JOptionPane.showInputDialog(null, "Digite a quantidade de dinheiro investida:");
            }while(nome.equals("")||nome.equals(" "));
            investidor.setQuantidadeInvestido(Double.parseDouble(quantidadeInvestida));

            investidor.setKey(chave2);
            investidor.incrementa(chave2);
            investidores[chave2] = investidor;
            listarInvestidores();
    }

    private void cadastrarEmpreendedor() {
        chave++;
        ideias1 = new ideiasDeNegocio();
        ideias2 = new ideiasDeNegocio();
        empreendedor = new Empreendedor();
        String nome, cpf, titulo, dataCriacao, descricao;

        do {
            nome = JOptionPane.showInputDialog(null, "Digite o Nome:");
        } while (nome.equals("") || nome.equals(" "));
        empreendedor.setNome(nome);

        do {
            cpf = JOptionPane.showInputDialog(null, "Digite o CPF:"+"\n((com o formato YYY.YYY.YYY-YY).");
        }while(cpf.equals("")||cpf.equals(" "));
        empreendedor.setCpf(cpf);

        do {
            titulo = JOptionPane.showInputDialog(null, "Digite o Título da ideia do seu negocio:");
        }while(titulo.equals("")||titulo.equals(" "));
        ideias1.setTituloIdeia(titulo);

        do {
            dataCriacao = JOptionPane.showInputDialog(null, "Digite a Data de Criação:"+"\n(no formato dd/mm/aaaa).");
        }while(dataCriacao.equals("")||dataCriacao.equals(" "));
        ideias1.setDataCriacao(dataCriacao);

        do {
            descricao = JOptionPane.showInputDialog(null, "Digite a Descrição da sua ideia:"+"\n(com no máximo 1000 caracteres).");
        }while(descricao.equals("")||descricao.equals(" "));
        ideias1.setDescricao(descricao);

        empreendedor.contador = chave;
        empreendedor.setKey(chave);
        ideia1[chave] = ideias1;
        ideias2.setKey(0);
        ideia2[chave] = ideias2;
        empreendedores[chave] = empreendedor;
        empreendedor.incrementa(chave);
        System.out.print(empreendedor.contador);
        listarEmpreendedores();
    }

    private String listarEmpreendedores() {
        String listarEmpreendedores = "Empreendedores: \n";
        int k = 1;
        if (chave == 0)
            return "Não há nada para exibir";
        else{
            while (k != empreendedor.contador + 1) {
                listarEmpreendedores +=
                        "\nIDª" + empreendedores[k].getKey() + "\n" +
                                "Nome:" + empreendedores[k].getNome() + "\n" +
                                "CPF:" + empreendedores[k].getCpf() + "\n"+"\n"+
                                listarIdeias(k);
                k++;
            }
        }
        return listarEmpreendedores;
    }

    private String listarInvestidores () {
        String listarInvestidores = "Investidores: \n";
        int k = 1;
        if (chave2 == 0)
            return "Nao há nada a exibir";
        else {
            while (k != investidor.contador+1) {
                listarInvestidores +=
                        "Nª: " + investidores[k].getKey() + "\n" +
                                "Nome: " + investidores[k].getNome() + "\n" +
                                "Total Investido: " + investidores[k].getQuantidadeInvestido() + "\n" + "\n" +
                                "Empreendedores apoiados: \n" + investidores[k].getMeusProjetosInvestidos() + "\n" + "\n" ;
                k++;
            }
        }
        return listarInvestidores;
    }

    private String listarIdeias(int key){
        if(ideia2[key].getKey() == 0)
            return listar1Ideias(key) + "\nNão há 2º projeto a exibir\n";
        return listar1Ideias(key) +"\n"+ listar2Ideias(key);
    }

    private String listar1Ideias(int key){
        String listarIdeias = "1º Projeto: \n";
        listarIdeias +=
                "Titulo: " + ideia1[key].getTituloIdeia() + "\n" +
                        "Data de Criação: " + ideia1[key].getDataCriacao() + "\n" +
                        "Descricao: " + ideia1[key].getDescricao() + "\n";
        return listarIdeias;
    }

    private String listar2Ideias(int key){
        String listar2Ideias = "2º Projeto: \n";
        listar2Ideias +=
                "Titulo: " + ideia2[key].getTituloIdeia() + "\n" +
                        "Data de Criação: " + ideia2[key].getDataCriacao() + "\n" +
                        "Descricao: " + ideia2[key].getDescricao() + "\n";
        return listar2Ideias;
    }

    private void cadastrarInvestimento(){
        int i = 1, k = 1;
        double montante = 0;

        System.err.println("LISTA INVESTIDORES: " +  "\n") ;
        while(i != investidor.contador + 1){
            System.out.println("ID: " + investidores[i].getKey() +
                    "Nome: " + investidores[i].getNome());
            i++;
        }

        int chooseInv = 0, chooseEmp = 0;
        String valor = "", mont = "";

        try{
            do{
                valor = JOptionPane.showInputDialog(null, "Digite o ID do investidor(Listado no terminal)");
                }
                while(valor.equals("")||valor.equals(" "));
                //chooseInv = Integer.parseInt(valor);
            }
            catch(NumberFormatException x) {
                JOptionPane.showMessageDialog(null, "Digite um valor INTEIRO valido");
            }
            finally {
            chooseInv = Integer.parseInt(valor);
        }

        System.err.println("LISTA EMPREENDEDORES: " + "\n");
        while(k != empreendedor.contador + 1){

            System.out.println("ID:" + empreendedores[k].getKey() +
                    "Nome: " + empreendedores[k].getNome());
            k++;
        }

        try{
            do{
                valor = JOptionPane.showInputDialog(null, "Digite o numero ID do projeto a ser investido(Verifique terminal)");
            }
            while( valor.equals("")||valor.equals(" "));
            chooseEmp = Integer.parseInt(valor);
            do{
                mont = JOptionPane.showInputDialog(null, "Digite o valor a ser investido neste projeto");
            }
            while( valor.equals("")||valor.equals(" "));
            montante = Double.parseDouble(mont);
        }
        catch(NumberFormatException x){
            JOptionPane.showMessageDialog(null, "Digite um valor INTEIRO valido");
        }

        investidores[chooseInv].setMeusProjetosInvestidos("ID: " + empreendedores[chooseEmp].getNome() +
                "\nNome: " + empreendedores[chooseEmp].getNome() +
                "\nValor Investido: " + montante);
    }

    private void adicionar(){
        int n = 0;
        String aux = "";
        String menuAdicionar;
        Object op1 = "Adicionar um empreendedor com suas informações básicas e uma ideia de negócio";
        Object op2 = "Adicionar nova ideia de negócio a um empreendedor já cadastrado";
        Object op3 = "Adicionar um investidor com suas informações básicas";
        Object op4 = "Adicionar um investimento a um projeto já cadastrado";
        Object[] choose1 = {op1, op2, op3, op4};
        menuAdicionar = (String) JOptionPane.showInputDialog(JOptionPane.getRootFrame(), "Digite uma opção", "Escolha algo", JOptionPane.PLAIN_MESSAGE, null, choose1, "Adicionar");
        if (menuAdicionar.equals(op1)) {
            cadastrarEmpreendedor();
        }
        if (menuAdicionar.equals(op2)) {
            if(chave == 0) {
                JOptionPane.showMessageDialog(null, "Primeiro adicione um Empreendedor");
                menu();
            }
            do {
                try {
                    do {
                        aux = JOptionPane.showInputDialog(null, "Digite o (ID válido) do Empreendedor para Adicionar outra Ideia: \n");
                    }while (aux.equals("") || aux.equals(" "));
                    n = Integer.parseInt(aux);
                }catch(NumberFormatException s) {
                    JOptionPane.showMessageDialog(null, "ID digitado é inválido");
                    menu();
                }
                if(n > chave)
                    JOptionPane.showMessageDialog(null, "ID digitado é inválido");
            }while(n > chave);
             adicionarNovaIdeia(n);
        }
        if (menuAdicionar.equals(op3)) {
            cadastrarInvestidor();
        }
        if (menuAdicionar.equals(op4)) {
            cadastrarInvestimento();
        }
    }

    private void visualizar(){
        Object[] choose2 = {"Empreendedor", "Investidor", "Retornar"};
        String menu2;
        do {
            menu2 = (String) JOptionPane.showInputDialog(JOptionPane.getRootFrame(), "Você deseja visualizar:", "Escolha algo", JOptionPane.PLAIN_MESSAGE, null, choose2, "Adicionar");
            switch (menu2) {
                case "Empreendedor":
                    JOptionPane.showMessageDialog(null, "printing on terminal...");
                    System.out.println(listarEmpreendedores());
                    break;
                case "Investidor":
                    JOptionPane.showMessageDialog(null, "printing on terminal...");
                    System.out.println(listarInvestidores());
                    break;
            }
        } while (menu2.equals("Retornar"));
    }

    final protected void menu() {
        Object[] choose = {"Adicionar...", "Visualizar...", "Sair do Programa"};
        String temp;
        try {
            do {
                temp = (String) JOptionPane.showInputDialog(JOptionPane.getRootFrame(), "Escolha uma opção", "Escolha algo", JOptionPane.PLAIN_MESSAGE, null, choose, "Adicionar");
                switch (temp) {
                    case "Adicionar...":
                        try {
                            adicionar();
                            break;
                        }
                        catch (java.lang.NullPointerException e){
                            break;
                        }

                    case "Visualizar...":
                        try {
                            visualizar();
                            break;
                        }
                        catch (java.lang.NullPointerException e){
                            break;
                        }
                    default:
                        break;
                }
            } while (!temp.equals("Sair do Programa"));
            System.exit(0);
        } catch (java.lang.NullPointerException e) {
            System.exit(0);
        }
    }
}
