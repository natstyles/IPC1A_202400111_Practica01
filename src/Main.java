//Librerias
import java.util.Scanner;

//Clase principal
public class Main{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        //VARIABLES DE INICIO DE SESIÓN
        final String user = "skibidi";
        final String pass  = "toilet";
        boolean acceso = false;
        int intentos = 3;

        //Mensaje de bienvenida
        System.out.println("Sistema de inventario del Dojo Cobra Kai");
        System.out.println("----------------------------------------");
        System.out.println("Ingresa tus certificados de inicio de sesión (usuario y contraseña)");
        System.out.println("----------------------------------------");

        //Validando certificados
        while (acceso == false){
            System.out.println("Ingrese su usuario: ");
            String tryuser = leer.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String trypass = leer.nextLine();
            if(tryuser.equals(user) && trypass.equals(pass)){
                System.out.println("Acceso concedido, ingresando al sistema");
                System.out.println("----------------------------------------");

                //Dar acceso al menú principal
                acceso = true;


            }else{
                System.out.println("Certificados incorrectos, inténtalo nuevamente");
                System.out.println("----------------------------------------");
                }
            }

        //LLEVAR AL USUARIO AL MENÚ PRINCIPAL
        if (acceso == true){
            mainMenu(leer);
        }
    }

    //Menu del sistema
    public static void mainMenu(Scanner leer){

        while(true){
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
            leer.nextLine(); //Limpiar el buffer
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
    }

    //OPERACION PARA PRODUCTOS INDIVIDUALES
    //CREAR ARRAYS PARA ALMACENAR NOMBRE Y PRECIO DE PRODUCTOS
    static String[] nombreProducto = new String[100];
    static double[] precioProducto = new double[100];
    static int cantidadProducto = 0;

    //CREANDO METODO PARA AGREGAR PRODUCTOS
    public static void agregarProducto(Scanner leer){
        System.out.println("\n--- Ingresar un nuevo producto (Individual) ---");
        System.out.println("----------------------------------------");
        System.out.println("Ingresa el nombre del producto: ");
        String nombre = leer.nextLine();

        //Verificar si el producto ya existe
        for(int i = 0; i < cantidadProducto; i++){
            if(nombreProducto[i].equalsIgnoreCase(nombre)){
                System.out.println("El producto ya existe en el inventario");
                System.out.println("Presiona cualquier tecla para regresar al menú principal...");
                leer.nextLine();
                return;
            }
        }


        //Ingresar el precio del producto
        System.out.println("Ingresa el precio del producto: ");
        double precio = leer.nextDouble();
        leer.nextLine(); //Limpiar el buffer

        //Comprobar que el precio sea mayor a 0
        if(precio <= 0){
            System.out.println("El precio del producto debe ser mayor a 0");
            System.out.println("Presiona cualquier tecla para regresar al menú principal...");
            leer.nextLine();
            return;
        }

        //Agregar el producto al inventario
        if(cantidadProducto < nombreProducto.length){
            nombreProducto[cantidadProducto] = nombre;
            precioProducto[cantidadProducto] = precio;
            cantidadProducto++;
            System.out.println("Producto agregado correctamente");
            System.out.println("Presiona cualquier tecla para regresar al menú principal...");
            leer.nextLine();
        }else{
            System.out.println("No se pueden agregar más productos, el inventario está lleno");
            System.out.println("Presiona cualquier tecla para regresar al menú principal...");
            leer.nextLine();

        }
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