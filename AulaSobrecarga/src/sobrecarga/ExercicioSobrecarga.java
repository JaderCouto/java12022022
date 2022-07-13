package sobrecarga;

public class ExercicioSobrecarga {
    public static void areaQuadrilateros (double lado){
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void areaQuadrilateros  (double lado1, double lado2){
        System.out.println("Área do retangulo:  " + lado1 * lado2);
    }

    public static void areaQuadrilateros (double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio " + (baseMaior+baseMenor)*altura);
    }

    public static void areaQuadrilateros (float diagonal1, float diagonal2){
        System.out.println("Área do losango " + (diagonal1+diagonal2)/2);
    }
}

