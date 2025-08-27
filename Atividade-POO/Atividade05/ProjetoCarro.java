public class ProjetoCarro {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        carro01.marca = "Mercedes";
        carro01.modelo = "GT 63s";
        carro01.ano = 2023;

        System.out.println("=========Carro 01=========");
        carro01.exibirInformacoes();
        carro01.ligarCarro();

        Carro carro02 = new Carro();
        carro02.marca = "Toyota";
        carro02.modelo = "MK SUPRA";
        carro02.ano = 2002;

        System.out.println("=========Carro 02=========");
        carro02.exibirInformacoes();
        carro02.ligarCarro();

        //Mudando o Modelo
        System.out.println("=========Carro 01(modelo antigo)=========");
        carro01.exibirInformacoes();

        System.err.println("=========Alterando Modelo. . .=========");
        carro01.marca = "Mercedes";
        carro01.modelo = "GT 63S E v8 Biturbo";
        carro01.ano = 2025;
        carro01.exibirInformacoesModificadas();
        carro01.ligarCarro();
    }   
}