public class Director_academico extends Academico{

    String cargo;

    public Director_academico(int edad, String nombre, String apellidos) {
        super(edad, nombre, apellidos);
    }

    @Override
    public void universidad() {
        System.out.println("Voy a la Universidad");
    }

    @Override
    public void asistirtrabajo() {
        System.out.println("Asisto Feliz al Trabajo");
    }

    @Override
    public void trabajar() {
        System.out.println("Soy Director Academico de la UPeU");
    }
    
}
