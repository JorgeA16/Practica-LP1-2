public class Gerente extends Administrativo{
    
    String cargo;

    public Gerente(int edad, String nombre, String apellidos) {
        super(edad, nombre, apellidos);
    }

    @Override
    public void universidad() {
         System.out.println("Voy Feliz a la Universidad");
    }

    @Override
    public void asistirtrabajo() {
        System.out.println("Asisto con mucha alegria al Trabajo");
    }

    @Override
    public void trabajar() {
        System.out.println("Soy Gerente Administrativo de la UPeu filial Tarapoto");
    }

    
    
}
