public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro obj1;
        obj1 = new Livro();
        //ou
        Livro obj2 = new Livro();

        obj1.titulo = "Harry Potter e a Pedra Filosofal";
        obj1.numeroPaginas = 304;
        obj1.anoPublicacao = 1997;
        obj1.preco = 25.90;

        System.out.println("Título: " + obj1.titulo);
        System.out.println("Número da página: " + obj1.numeroPaginas);
        System.out.println("Ano de publicação: " + obj1.anoPublicacao);
        System.out.println("Preço: R$" + obj1.preco);

        //acessando métodos:
        obj1.cadastrar();
        double frete = obj1.calcFrete("66097-055");
        System.out.printf( "Frete R$ %.2f\n", frete);
        System.out.println("Valor final: R$" + (obj1.preco + frete));
    }
}

/* 1) Utilizando o ProjetoLivraria. Faça: 
• Instanciação de dois objetos da classe; R= Criar/adicionar mais um livro
• Alteração dos atributos através do objeto da classe; 
• Impressão dos atributos na tela; 
• Invocação dos métodos da classe. */