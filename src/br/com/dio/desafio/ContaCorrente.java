package br.com.dio.desafio;

public class ContaCorrente extends Conta{

    @Override
    void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    void depositar(double valor) {
        saldo += valor;
    }

    @Override
    void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    String imprimirExtrato() {
        return "ContaCorrente "+super.toString();
    }


}
