//Librerias
import java.util.Scanner;

//Clase principal
public class Main{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        //VARIABLES DE INICIO DE SESIÓN
        final String user = "skibidi";
        final String pass  = "toilet";
        int intentos = 3;

        //Mensaje de bienvenida
        System.out.println("Sistema de inventario del Dojo Cobra Kai");
        System.out.println("----------------------------------------");
        System.out.println("Ingresa tus certificados de inicio de sesión (usuario y contraseña)");
        System.out.println("----------------------------------------");

        //Validando certificados
        while (intentos >= 0){
            System.out.println("Ingrese su usuario: ");
            String tryuser = leer.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String trypass = leer.nextLine();
            if(tryuser.equals(user) && trypass.equals(pass)){
                System.out.println("Acceso concedido, ingresando al sistema");
                System.out.println("----------------------------------------");

                //Mostrar menú principal
                mainMenu(leer);

            }else{
                System.out.println("Certificados incorrectos, intentos restantes: " + intentos);
                System.out.println("----------------------------------------");

                //Cerrar programa si se agotan los intentos
                if(intentos == 0){
                    System.out.println("Has agotado tus intentos, el sistema se cerrará");
                    System.exit(0);
                }
                intentos--;
            }

        }
    }

    //Menu del sistema
    public static void mainMenu(Scanner leer){

        //BIENVENIDA
        System.out.println("\n--- Menú Principal ---");
        System.out.println("----------------------------------------");
        System.out.println("1. Ingresar un nuevo producto (Individual)");
        System.out.println("2. Ingresar un lote de productos (Carga masiva)");
        System.out.println("3. Realizar una venta");
        System.out.println("4. Realizar un reporte");
        System.out.println("5. Salir del sistema");
        System.out.println("----------------------------------------");
        System.out.println("Selecciona una opción para continuar");

        int opcion = leer.nextInt();
        //Selección de opciones
        switch(opcion){
            case 1:
                agregarProducto(leer);
                break;
            case 2:
                agregarLote(leer);
                break;
            case 3:
                realizarVenta(leer);
                break;
            case 4:
                realizarReporte(leer);
                break;
            case 5:
                System.out.println("Saliendo del sistema...");
                System.exit(0);
                break;
        }
    }

    //OPERACION PARA PRODUCTOS INDIVIDUALES
    public static void agregarProducto(Scanner leer){
        System.out.println("Ingresar un nuevo producto (Individual)");

        //CREAR ARRAYS PARA INGRESAR PRODUCTOS INDIVIDUALES



    }




























    //OPERAIÓN PARA CARGA MASIVA
    public static void agregarLote(Scanner leer){
        System.out.println("Ingresar un lote de productos (Carga masiva)");
    }

    //OPERACIÓN PARA VENDER PRODUCTOS
    public static void realizarVenta(Scanner leer){
        System.out.println("Realizar una venta");
    }

    //OPERACIÓN PARA REALIZAR UN REPORTE
    public static void realizarReporte(Scanner leer){
        System.out.println("Realizar un reporte");
        System.out.println("----------------------------------------");
        System.out.println("Elije una opción:");
        System.out.println("1. Top 5 de productos más vendidos");
        System.out.println("2. Reporte total de ventas");
    }
}