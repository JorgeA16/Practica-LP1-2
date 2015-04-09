public class Jefe_Area extends Administrativo{
    
    String cargo;

    public Jefe_Area(int edad, String nombre, String apellidos) {
        super(edad, nombre, apellidos);
    }

    @Override
    public void universidad() {
        System.out.println("Voy a la Universidad");
    }

    @Override
    public void asistirtrabajo() {
        System.out.println("Asisto al Trabajo");
    }

    @Override
    public void trabajar() {
        System.out.println("Soy Jefe del Area Administrativa");
    }
    
}
