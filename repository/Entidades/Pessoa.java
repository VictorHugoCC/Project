package Entidades;

//Criando a entidade 'Pessoa'
public class Pessoa {
    //Atribuindo produtos com encapsulamento
    private String cpf;
    private String nome;
    private String cell;
    private String endereco;
    private int id;

    //Criação do 'Construtor'pradão
    public Pessoa() {

    }
    
    //Criação dos 'get' e 'set'
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    

}