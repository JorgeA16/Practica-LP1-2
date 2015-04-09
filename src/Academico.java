public abstract class Academico implements Persona{
    
    int edad;
    String nombre, apellidos;
    public Academico(int edad, String nombre, String apellidos) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

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
    
    public void asistir(){
        System.out.println("Asisto Temprano a la Universidad");
    }
    
}
