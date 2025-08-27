/*4) Criar uma classe ContaBancaria que represente uma conta de banco simples, com métodos para depósito, 
saque e consulta de saldo. 
Parte 1: Criar a Classe ContaBancaria
 A classe deve ter:
 1. Atributos:
 • numeroConta (String)
 • titular (String)
 • saldo (double)
 2. Métodos:
 • depositar(double valor): aumenta o saldo.
 • sacar(double valor): diminui o saldo (se houver saldo suficiente).
 • consultarSaldo(): exibe o saldo atual.
 Parte 2: Classe Principal para Testar
 Crie uma classe Main com um método main para:
 1. Instanciar dois objetos da classe ContaBancaria (ex: conta1 e conta2).
 2	Realizar operações de depósito, saque e consulta em cada conta.*/
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.numeroConta = "001";
        conta1.titular = "Marinalda da Silva Issues";
        conta1.saldo = 1000.0;

        System.out.println("=== Operações na Conta 1 ===");
        conta1.exibir();
        conta1.depositar(200);
        conta1.sacar(150);
        conta1.consultarSaldo();

        ContaBancaria conta2 = new ContaBancaria();

        conta2.numeroConta = "002";
        conta2.titular = "Joãozinho do Pop";
        conta2.saldo = 500.0;

        System.out.println("\n=== Operações na Conta 2 ===");
        conta2.exibir();
        conta2.depositar(300);
        conta2.sacar(1000); // tentativa de saque maior que o saldo
        conta2.consultarSaldo();
    }

}
