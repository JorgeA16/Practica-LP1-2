public class Tesorero extends Administrativo{
    
    String cargo;

    public Tesorero(int edad, String nombre, String apellidos) {
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
         System.out.println("Soy Tesorero de la FIA");
    }
    
}
