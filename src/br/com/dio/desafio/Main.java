package br.com.dio.desafio;

public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(150);
        cc.transferir(100,cp);
        cp.depositar(200);


        System.out.println(cc.imprimirExtrato());
        System.out.println(cp.imprimirExtrato());
    }
}
