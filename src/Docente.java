public class Docente extends Academico{
    
    String cargo;

    public Docente(int edad, String nombre, String apellidos) {
        super(edad, nombre, apellidos);
    }

    @Override
    public void universidad() {
        System.out.println("Voy a la UPeU");
    }

    @Override
    public void asistirtrabajo() {
        System.out.println("Asisto al Trabajo Feliz");
    }

    @Override
    public void trabajar() {
        System.out.println("Soy Docente de LP1 por que los alumnos son cheveres");
    }
    
}
