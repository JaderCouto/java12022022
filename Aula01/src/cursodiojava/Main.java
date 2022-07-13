package cursodiojava;

public class Main {
    public static void main(String[] args) {

        //Calculadora

        System.out.println("Resultados do exercício Calculadora");
        CalculadoraExercicio.soma(3, 5);
        CalculadoraExercicio.subtracao(6, 9);
        CalculadoraExercicio.multiplicacao(4, 2);
        CalculadoraExercicio.divisao(10, 2);


        //Horas
        System.out.println("Resultados do exercício das mensagens das horas:");
        HorasMensagem.teste(5);
        HorasMensagem.teste(20);
        HorasMensagem.teste(3);
        HorasMensagem.teste(16);

        //Exercicios Emprestimo
        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }

}