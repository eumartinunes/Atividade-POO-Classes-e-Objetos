/*3) Crie um projeto chamado ProjetoAluno e construa nele a classe Aluno, 
contendo os atributos: 
• nome (String)
 • matricula (int)
 • notaAv1 (double)
 • notaAv2 (double)
 A classe deve ter métodos para:
 • Mostrar os dados do aluno.
 • Calcular a média
 • Verificar aprovação, de acordo com as regras da UNAMA.
 Em seguida:
 1. Crie dois objetos da classe Aluno.
 2. Atualize a nota de um aluno.
 3. Mostre os dados atualizados.
 4. Chame o método para verificar se está aprovado.
 5. Utilize a função calcular média dentro de verificar aprovação para saber se o aluno passou.*/
public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "José Mauro";
        aluno1.matricula = 11111;
        aluno1.notaAv1 = 7.50;
        aluno1.notaAv2 = 6.00;

        System.out.println("=====Aluno01=====");
        aluno1.exibir();
        System.out.printf("Média: %.2f\n", aluno1.mediaSemestral(aluno1.notaAv1, aluno1.notaAv2));
        aluno1.verificarAprovacao();

        Aluno aluno2 = new Aluno();
    
        aluno2.nome = "Ana Beatriz";
        aluno2.matricula = 101010;
        aluno2.notaAv1 = 9.50;
        aluno2.notaAv2 = 10.00;

        System.out.println("=====Aluno02=====");
        aluno2.exibir();
        System.out.printf("Média: %.2f\n", aluno2.mediaSemestral(aluno2.notaAv1, aluno2.notaAv2));
        aluno2.verificarAprovacao();
        

        //atualização de notas
        System.out.println("=====Aluno01(Dados Antigos)=====");

        aluno1.exibirNomeNota();

        aluno1.notaAv1 = 7.00;
        aluno1.notaAv2 = 8.00;


        System.out.println("=====Atualização de Notas=====");
        aluno1.exibir();
        System.out.printf("Média: %.2f\n", aluno1.mediaSemestral(aluno1.notaAv1, aluno1.notaAv2));
        aluno1.verificarAprovacao();
        
    }
}


