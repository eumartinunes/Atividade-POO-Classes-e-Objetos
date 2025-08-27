/*5) Crie um projeto chamado ProjetoCarro e construa nele a classe Carro, contendo os atributos: 
• marca (String)
 • modelo (String)
 • ano (int)
 A classe deve ter métodos para:
 • Mostrar as informações do carro.
 • Ligar o carro (exibir uma mensagem na tela).
 Em seguida :
 1. Crie dois objetos da classe Carro.
 2. Altere os atributos de um dos objetos.
 3. Mostre os valores modificados na tela.
 4. Chame os métodos da classe usando o objeto.*/
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
