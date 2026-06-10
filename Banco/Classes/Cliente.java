package Banco.Classes;

import java.time.LocalDate;

public class Cliente extends Pessoa {

    private String email;
    private String endereco;
    private String login;
    private String senha;

    public Cliente(
            String nome,
            LocalDate dataNascimento,
            String cpf,
            String email,
            String endereco,
            String login,
            String senha) {

        super(nome, dataNascimento, cpf);

        this.email = email;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void apresentarDadosCliente() {
        System.out.println(
            "===== DADOS DO CLIENTE =====" +
            "\nNome: " + getNome() +
            "\nData de Nascimento: " + getDataNascimento() +
            "\nCPF: " + getCpf() +
            "\nEmail: " + email +
            "\nEndereço: " + endereco +
            "\nLogin: " + login
        );
    }
}