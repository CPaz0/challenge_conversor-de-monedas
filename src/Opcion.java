public class Opcion {
    private String baseCode = "";
    private String targetCode = "";
    private String menu = """
                \n
                *****            CONVERSOR DE MONEDAS            *****
                \n
                - Tipo de monedas que podemos convertir.
                \n
                1 - COP (Peso Colombiano) - EUR (Euro).
                2 - EUR (Euro) - COP (Peso Colombiano).
                3 - COP (Peso Colombiano) - USD	(United States Dollar).
                4 - USD	(United States Dollar) - COP (Peso Colombiano).
                5 - EUR (Euro) - USD (United States Dollar).
                6 - USD	(United States Dollar) - EUR (Euro).
                9 - Salir.
                """;
    public String getMenu() {
        return menu;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void opcionUsuario(int opcion){
        switch (opcion) {
                case 1:
                    System.out.println("COP (Peso Colombiano) - EUR (Euro).");
                    baseCode = "COP";
                    targetCode = "EUR";
                    break;
                case 2:
                    System.out.println("EUR (Euro) - COP (Peso Colombiano).");
                    baseCode = "EUR";
                    targetCode = "COP";
                    break;
                case 3:
                    System.out.println("COP (Peso Colombiano) - USD	(United States Dollar).");
                    baseCode = "COP";
                    targetCode = "USD";
                    break;
                case 4:
                    System.out.println("USD	(United States Dollar) - COP (Peso Colombiano).");
                    baseCode = "USD";
                    targetCode = "COP";
                    break;
                case 5:
                    System.out.println("EUR (Euro) - USD (United States Dollar).");
                    baseCode = "EUR";
                    targetCode = "USD";
                    break;
                case 6:
                    System.out.println("USD	(United States Dollar) - EUR (Euro).");
                    baseCode = "USD";
                    targetCode = "EUR";
                    break;

                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicio");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
    }
}
