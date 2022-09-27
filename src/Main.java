public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio IF");

        int numeroIf = 10;
        if (numeroIf > 0){
            System.out.println(numeroIf + " Es POSITIVO");
        } else if (numeroIf == 0) {
            System.out.println(numeroIf + " Es un 0");
        } else {
            System.out.println(numeroIf + " Es NEGATIVO");
        }

        System.out.println();
        System.out.println("Ejercicio While");

        int numeroWhile = -3;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println();
        System.out.println("Ejercicio Do-While");

        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        System.out.println();
        System.out.println("Ejercicio For");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println();
        System.out.println("Ejercicio Switch");
        String estacion = "Verano";
        switch (estacion){
            case "Invierno":
                System.out.println("Estas en invierno");
                break;
            case "Primavera":
                System.out.println("Estás en primavera");
                break;
            case "Verano":
                System.out.println("Estas en verano");
                break;
            case "Otoño":
                System.out.println("Estás en Otoño");
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}