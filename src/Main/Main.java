 
package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner (System.in);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        boolean salir = false;

        while(!salir) {
            System.out.println("Ingrese una opcion entre 1 y 5 para poder realizar el ejercicio.");
            System.out.println("1. Ingresar datos del empleado.");
            System.out.println("2. Listar empleados.");
            System.out.println("3. Eliminar empleados");
            System.out.println("4. Modificar registro");
            System.out.println("5. Salir del sistema");

            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1://Ingresar datos a la base de Local Storage.
                    Empleado a = new Empleado();
                    System.out.println("Ingresar Id del empleado.");
                    a.setId(entrada.nextLine());

                    System.out.println("Ingrese Nombre del empleado");
                    a.setNombre(entrada.nextLine());

                    System.out.println("Ingrese Apellidos del empleado.");
                    a.setApellido(entrada.nextLine());
                    
                    System.out.println("Ingrese Salario del empleado.");
                    a.setSalario(entrada.nextLine());

                    listaEmpleados.add(a);

                    System.out.println("Datos Ingresados: ");
                    System.out.println("ID: " + a.getId());
                    System.out.println("Nombres: "+ a.getNombre());
                    System.out.println("Apellidos: " +a.getApellido());
                    System.out.println("Salario: "+a.getSalario());
                    break;

                case 2://LIstar todos los datos ingresados.

                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        System.out.println("Empleado: " + (i + 1));

                        Empleado auto = listaEmpleados.get(i);

                        
                        System.out.println("Nombre: "+auto.getNombre());
                        System.out.println("Apellidos: "+ auto.getApellido());
                        System.out.println("Salario: "+auto.getSalario());
                        
                    }
                    break;

                case 3://Eliminar registro.
                    System.out.println("Ingresa el ID del empleado a eliminar..");
                    String Id = entrada.nextLine();

                    for (int i = 0; i < listaEmpleados.size(); i++) {

                        Empleado auto = listaEmpleados.get(i);

                        if (Id.equals(auto.getId())) {

                            listaEmpleados.remove(i);

                            System.out.println("Empleado eliminada.");

                        }else{
                            System.out.println("Error el ID no existe en la Base de datos");

                        }

                    }
                    break;

                case 4://Modificar registro.
                    System.out.println("Por favor ingrese el ID a ser modificado.");
                    Id = entrada.nextLine();

                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        Empleado auto = listaEmpleados.get(i);

                        if (Id.equals(auto.getId())) {

                            System.out.println("Nombre: " + auto.getNombre());
                            System.out.println("Apellido: " + auto.getApellido());
                            System.out.println("Salario: " + auto.getApellido());

                            System.out.println("Ingresa un nuevo Nombre: ");
                            String nombre = entrada.nextLine();
                            System.out.println("Ingresa nuevo Apellido: ");
                            String apellido = entrada.nextLine();
                            System.out.println("Ingrese nuevo salario:");
                            String salario = entrada.nextLine();

                            auto.setNombre(nombre);
                            auto.setApellido(apellido);
                            auto.setSalario(salario);

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
