 
package Main;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner (System.in);

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        boolean salir = false;

        while(!salir) {
            System.out.println("Ingrese una opcion.");
            System.out.println("1 - Ingresar datos.");
            System.out.println("2 - Listar.");
            System.out.println("3 - Eliminar.");
            System.out.println("4 - Modificar.");
            System.out.println("5 - Salir");

            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1://Ingresar datos a la base de Local Storage.
                    Persona a = new Persona();
                    System.out.println("Ingresar Id del empleado.");
                    a.setId(entrada.nextLine());

                    System.out.println("Ingrese Nombre del empleado");
                    a.setNombre(entrada.nextLine());

                    System.out.println("Ingrese Apellidos del empleado.");
                    a.setApellido(entrada.nextLine());

                    listaPersonas.add(a);

                    System.out.println("Datos Ingresados: ");
                    System.out.println("ID: " + a.getId() + " = " + a.getNombre()+" " + a.getApellido() );
                    break;

                case 2://LIstar todos los datos ingresados.

                    for (int i = 0; i < listaPersonas.size(); i++) {
                        System.out.println("Persona: " + (i + 1));

                        Persona auto = listaPersonas.get(i);

                        System.out.println(auto.getNombre()+ " " + auto.getApellido());
                    }
                    break;

                case 3://Eliminar registro.
                    System.out.println("Ingresa el ID del empleado a eliminar..");
                    String Id = entrada.nextLine();

                    for (int i = 0; i < listaPersonas.size(); i++) {

                        Persona auto = listaPersonas.get(i);

                        if (Id.equals(auto.getId())) {

                            listaPersonas.remove(i);

                            System.out.println("Persona eliminada.");

                        }else{
                            System.out.println("Error, ID no encontrado.");

                        }

                    }
                    break;

                case 4://MOdificar registro.
                    System.out.println("Ingrese el id a modificar....");
                    Id = entrada.nextLine();

                    for (int i = 0; i < listaPersonas.size(); i++) {
                        Persona auto = listaPersonas.get(i);

                        if (Id.equals(auto.getId())) {

                            System.out.println("Nombre: " + auto.getNombre());
                            System.out.println("Apellido: " + auto.getApellido());

                            System.out.println("Ingresa un nuevo Nombre: ");
                            String nombre = entrada.nextLine();
                            System.out.println("Ingresa nuevo Apellido: ");
                            String apellido = entrada.nextLine();

                            auto.setNombre(nombre);
                            auto.setApellido(apellido);

                        }
                    }
                    break;
                case 5://Salir del programa
                    salir = true;
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Opcion no valida!!!!!");

            }

        }
        
    }
    
}
