public class Aluno {

    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Av1: " + notaAv1);
        System.out.println("nota Av2: " + notaAv2);
    }
    void exibirNomeNota(){
        System.out.println("Nome: " + nome);
        System.out.println("Nota Av1: " + notaAv1);
        System.out.println("Nota Av2: " + notaAv2);
    }

    double mediaSemestral(double notaAv1, double notaAv2){
        return (notaAv1 + notaAv2) / 2;
    }

    void verificarAprovacao(){
        if (mediaSemestral(notaAv1, notaAv2) >= 7 ) {
            System.out.println("O aluno está aprovado no Semestre!\n");
        } else System.out.println("O aluno não obteve a média nescessária\n");
    }
}

