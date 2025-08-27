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