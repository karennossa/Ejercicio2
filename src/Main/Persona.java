package Main;

public class Persona {

    private String Id;
    private  String Nombre;
    private  String Apellido;


    public Persona(){}

    public Persona (String Id, String Nombre, String Apellido){

        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
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

}
