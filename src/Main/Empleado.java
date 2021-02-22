package Main;

public class Empleado {

    private String Id;
    private  String Nombre;
    private  String Apellido;
    private String Salario;


    public Empleado(){}

    public Empleado (String Id, String Nombre, String Apellido){

        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Salario = Salario;
    }
    public String getId(){
        return this.Id;
    }
    public void setId(String Id){
        this.Id = Id;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;

    }
    public String getApellido(){
        return this.Apellido;
    }
    
    public String getSalario(){
        return this.Salario;
        
    }
    
    public String setSalario( String Salario){
        this.Salario = Salario;
        return null;
    }


}
