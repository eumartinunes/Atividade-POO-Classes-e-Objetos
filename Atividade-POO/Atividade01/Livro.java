public class Livro {

    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    void cadastrar(){
        System.out.println("Cadastrando no Banco de Dados...");
    }

    double calcFrete(String cep){
        System.out.println("Calculando frete para o CEP: " + cep);
        return 15.90;
    }

    void vender(){
        System.out.printf("Vendendo livro por R$ %.2f\n", preco);
    }
    
    String trocar(){
        return "Livro trocado!";
    }
}
