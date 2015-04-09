public class Contador extends Administrativo{
    
    String cargo;

    public Contador(int edad, String nombre, String apellidos) {
        super(edad, nombre, apellidos);
    }

    @Override
    public void universidad() {
        System.out.println("Voy a la universidad");
    }

    @Override
    public void asistirtrabajo() {
        System.out.println("Asisto al Trabajo");
    }

    @Override
    public void trabajar() {
        System.out.println("Soy Contador de Prestigio");
    }
    
}
