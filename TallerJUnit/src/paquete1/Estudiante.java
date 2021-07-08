
package paquete1;

public class Estudiante {
    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;

    public void establecerNombresEstudiante(String tipo){
        nombresEstudiante = tipo;
    }
    
    public void establecerApellidoEstudiante(String tipo){
        apellidosEstudiante = tipo;
    }
    
    public void establecerIdentificacionEstudiante(String tipo){
        identificacionEstudiante = tipo;
    }
    
    public String obtenerNombresEstudiante(){
        return nombresEstudiante;
    }
    
    public String obtenerApellidoEstudiante(){
        return apellidosEstudiante;
    }
    
    public String obtenerIdentificacionEstudiante(){
        return identificacionEstudiante;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre Estudiante: %s %s\nCédula: %s",
                obtenerNombresEstudiante(),
                obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante());
        return cadena;
    }
}
