import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;

        Scanner lecturaTeclado = new Scanner(System.in);

        while (opcion != 9) {
            Opcion opcionUsuario = new Opcion();

            System.out.println(opcionUsuario.getMenu());
            System.out.println("Seleccione la opción que quieres : ");

            try {
                opcion = lecturaTeclado.nextInt();
            }catch (Exception e) {
                System.out.println( "ERROR, Solo se permiten números enteros. " + e );
                System.out.println("Proceso finalizado");
                break;
            }


            opcionUsuario.opcionUsuario(opcion);

            if (!Objects.equals(opcionUsuario.getTargetCode(), "")) {

                ConsultaMoneda consulta = new ConsultaMoneda();

                Moneda moneda = consulta.buscarMoneda(opcionUsuario.getBaseCode(), opcionUsuario.getTargetCode());

                System.out.println("Conversion Rate : " + moneda.conversion_rate());

                System.out.println("Ingrese el monto de " + opcionUsuario.getBaseCode());

                double monto = lecturaTeclado.nextDouble();
                CalculoDeCambio calculoDeCambio = new CalculoDeCambio();
                calculoDeCambio.cambio(moneda.conversion_rate(), monto);
                System.out.println(calculoDeCambio.getCambioTotal() + " " + opcionUsuario.getTargetCode());

                lecturaTeclado.nextLine(); //Limpiamos buffer del System.in
                System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
                lecturaTeclado.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER
            }
        }

 }

}
