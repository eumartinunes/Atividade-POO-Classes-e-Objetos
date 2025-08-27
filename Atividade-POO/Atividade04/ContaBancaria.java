public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    void exibir(){
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("O depósito de R$ " + valor + " Foi realizado!\nTeu saldo atual: R$ " + saldo);
    }

    void sacar(double valor){
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("O saque de R$ " + valor + " Foi realizado!\nSeu saldo atual: R$ " + saldo);
        } else System.out.println("Saldo Insuficiente para continuar");
    }

    void consultarSaldo(){
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }
}
