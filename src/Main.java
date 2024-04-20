import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Articulo> ListaArt = new ArrayList<Articulo>();
    public static void main(String[] args){

        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        int opc;
        while(true){
            try{
                ImprimirMenu();
                opc = sn.nextInt();
                sn.nextLine();

                if(opc == 0){
                    System.out.println("\nGracias por utilizar el programa!! :)");
                    break;
                }

                switch (opc){
                    case 1:
                        System.out.println("\n\t== Agregar producto a la lista ==\n");
                        agregarProducto();
                        break;

                    case 2:
                        System.out.println("\n\t== MODIFICANDO INFORMACION ==\n");
                        modificarDescripProduct();
                        break;

                    case 3:
                        System.out.println("\n\t== CONSULTAR LISTA ==\n");
                        consultarListaProduct();
                        break;
                }

            }catch(InputMismatchException p){
                System.out.println("\nEl dato que ha ingresado es erroneo.Por favor ingrese un dato valido\n");
                sn.nextLine();
            }

        }


    }

    private static void consultarListaProduct() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese del id del producto: ");
        int ID_Producto = sn.nextInt();




    }

    private static void modificarDescripProduct() {
    }

    private static void agregarProducto() {
        Scanner sn = new Scanner(System.in);
        String nombreProducto;
        String modelo;
        String descripcion;
        float precio;
        int ID_Producto;

        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = sn.nextLine();
        System.out.println("Ingrese el modelo del producto: ");
        modelo = sn.nextLine();
        System.out.println("Ingrese una breve descripcion del producto: ");
        descripcion = sn.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        precio = sn.nextFloat();
        System.out.println("Ingrese el ID del producto: ");
        ID_Producto = sn.nextInt();

       Articulo articulo = new Telefono(nombreProducto, modelo,descripcion,precio,ID_Producto);

       ListaArt.add(articulo);
       System.out.println("Producto agregado correctamente a la lista!!! ");



    }

    private static void ImprimirMenu(){
        System.out.println("Seleccione una opcion:\n"
                +"\t1.Agregar producto a la lista.\n"
                +"\t2.Modificar informacion del producto.\n"
                +"\t3.Consultar listado.\n"
                +"\t0.Salir.\n"

        );
        System.out.println("Escoja una opcion: ");

    }


}






