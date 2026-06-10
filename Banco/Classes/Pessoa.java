package Banco.Classes;
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;

    public Pessoa(String nome,LocalDate dataNascimento, String cpf){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento= dataNascimento;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void infoPessoa(){
        System.out.println(
            "Nome: " + nome +
            "\nData de nascimento: " + dataNascimento +
            "\nCPF: " + cpf
        );
    }
}
