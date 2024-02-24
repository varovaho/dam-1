package Principal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varov
 */
public class Persona { //Creamos la clase persona donde introduciremos los datos de persona, apellidos y dni tal y como se solicita en el ejercicio//
    private String nombre, apellidos, dni;

    public Persona(){
        this.nombre = "";
        this.dni = "";
        this.apellidos = "";
    }
    
    public Persona(String nombre, String apellidos, String dni) { //Generamos el constructor de la clase persona
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
// a partir de aquí utilizamos los getters y setters para poder acceder a esta clase, ya que los atributos de esta clase están privados.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
