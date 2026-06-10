package Banco.Classes;

public class Agencia {
    private String endereco;
    private int numero;

    public Agencia(String endereco, int numero) {
        this.endereco = endereco;
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero(){
        return numero;
    }
}