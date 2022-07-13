package cursodiojava;

public class HorasMensagem {
    public static void teste(int horas) {
        switch (horas) {
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaMadrugada();
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mensagemBomdia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora Inválida!");
                break;
        }
    }

    public static void mensagemBomdia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }

    public static void mensagemBoaMadrugada() {
        System.out.println("Boa Madrugada!");
    }
}