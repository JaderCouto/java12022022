public class Exercicioifswitch {
    public static void escolhaMes(int mes) {
        if (mes == 1) {
            System.out.println("O mes escolhido foi Janeiro");
        } else if (mes == 2) {
            System.out.println("O mes escolhido foi Fevereiro");
        } else if (mes == 3) {
            System.out.println("O mes escolhido foi Março");
        } else if (mes == 4) {
            System.out.println("O mes escolhido foi Abril");
        } else if (mes == 5) {
            System.out.println("O mes escolhido foi Maio");
        } else if (mes == 6) {
            System.out.println("O mes escolhido foi Junho");
        } else if (mes == 7) {
            System.out.println("O mes escolhido foi Julho");
        } else if (mes == 8) {
            System.out.println("O mes escolhido foi Agosto");
        } else if (mes == 9) {
            System.out.println("O mes escolhido foi Setembro");
        } else if (mes == 10) {
            System.out.println("O mes escolhido foi Outubro");
        } else if (mes == 11) {
            System.out.println("O mes escolhido foi Novembro");
        } else if (mes == 12) {
            System.out.println("O mes escolhido foi Dezembro");
        } else {
            System.out.println("Mes inválido!");
        }
    }

    public static void escolhaFerias(int mes) {
        if ((mes == 1) || (mes == 7) || (mes == 12)) {
            System.out.println("Férias!");
        }
    }
}