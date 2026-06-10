package Banco.Classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(
        "André",
        LocalDate.of(2001, 3, 15),
        "123.456.789-00",
        "andre@gmail.com",
        "Rua A",
        "andre123",
        "senha123"
    );
        Agencia agenciaBiomas = new Agencia("Rua Rondônia", 1523);
        Conta conta1 = new Conta(2503, agenciaBiomas, BigDecimal.ZERO, cliente1, 0);

    //cliente1.apresentarDadosCliente();
    //conta1.apresentarDadosConta();
    conta1.adicionarSaldo(new BigDecimal("100"));
    conta1.apresentarDadosConta();
    }
}