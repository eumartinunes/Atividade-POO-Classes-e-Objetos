public class Carro {

    String marca;
    String modelo;
    int ano;

    void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    void exibirInformacoesModificadas(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    void ligarCarro(){
        System.out.println("O carro " + marca + modelo + " está ligado.\n");
    }
}