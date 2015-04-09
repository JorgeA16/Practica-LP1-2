public class Coordinador extends Academico{
    
    String cargo;

    public Coordinador(int edad, String nombre, String apellidos) {
        super(edad, nombre, apellidos);
    }

    @Override
    public void universidad() {
        System.out.println("Von con toda la Felicidad a la Universidad");
    }

    @Override
    public void asistirtrabajo() {
        System.out.println("Asisto al Trabjo Puntual");
    }

    @Override
    public void trabajar() {
        System.out.println("Soy Coordinador de la FIA con mucho Orgullo");
    }
    
}
