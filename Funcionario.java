package model;

public class Funcionario {

    private static Integer id;
    private static String nome;
    private static String cpf;
    private static Double salario;

    public void Funcionario() {

    }

    public Funcionario(Integer id, String nome, String cpf, Double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public static Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;

    }
}
