package Banco.Classes;
import Banco.Classes.Agencia;
import java.math.BigDecimal;

public class Conta{
    private int numero;
    private Agencia agencia;
    private BigDecimal saldo;
    private Cliente titular;
    private int senhaTrasacao;

    public Conta(int numero,
                 Agencia agencia, 
                 BigDecimal saldo, 
                 Cliente titular, 
                 int senhaTrasacao 
             ){

        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
        this.senhaTrasacao = senhaTrasacao;
    }
    

    public int getNumero() {
        return Numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getSenhaTrasacao() {
        return senhaTrasacao;
    }

    public void setSenhaTrasacao(int senhaTrasacao) {
        this.senhaTrasacao = senhaTrasacao;
    }
    
    public boolean adicionarSaldo(BigDecimal valor) {

    if (valor.compareTo(BigDecimal.ZERO) <= 0) {
        return false;
    }

    saldo = saldo.add(valor);
    return true;
    }

    public void apresentarDadosConta() {
    System.out.println(
        "Titular: " + titular.getNome() +
        "\nCPF: " + titular.getCpf() +
        "\nConta: " + numero +
        "\nAgência: " + agencia.getNumero() +
        "\nSaldo: R$ " + saldo
    );
}

}
