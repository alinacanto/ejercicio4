public class Main {
    public static void main(String[] args) {
        var numeroif = 2;
        if (numeroif == 0)
            System.out.println("Es cero");
        if (numeroif <= 0)
            System.out.println("Es negativo");
        if (numeroif >= 0)
            System.out.println("Es positivo");


        int numeroWhile = 0;
        while (numeroWhile <3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);

        }
         int numeroDoWhile = 25;
        do {
            numeroDoWhile = numeroDoWhile +10;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile ==3);


        for ( int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1) {
            System.out.println (numeroFor);
        }

        //1 = PRIMAVERA
        //2 = OTONIO
        //3 = INVIERNO
        //4 = VERANO

        var estacion = 3;
        switch (estacion) {
            case 1:
                System.out.println ("PRIMAVERA");
                break;
            case 2:
                System.out.println ("OTONO");
                break;
            case 3:
                System.out.println ("INVIERNO");
                break;
            case 4:
                System.out.println ("VERANO");
                break;
            default:
                System.out.println ("estacion invalida");
        }
    }
}