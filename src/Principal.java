
import java.util.ArrayList;

public class Principal {

    public static ArrayList <Academico> Personal = new ArrayList<Academico>();
    public static ArrayList <Administrativo> Personal1 = new ArrayList<Administrativo>();
    
    public static void main(String[] args) {
        
        Academico Doc = new Docente(30, "Joel", "Perez");
        Academico Coo = new Coordinador(29, "Alexis", "Sanchez");
        Academico Da = new Director_academico(35, "George", "Goycochea");
        
        Personal.add(Doc);
        Personal.add(Coo);
        Personal.add(Da);
        
        System.out.println("Personal Academico un Dia en la Universidad");
        for(Academico Personal : Personal){
            System.out.println(Personal.getEdad()+" "+Personal.getNombre()+" "+Personal.getApellidos()+"");
            Personal.trabajar();
            Personal.asistir();
            Personal.universidad();
            System.out.println(" ");
        }
        
        Administrativo Ger =new Gerente(45, "Ricardo", "Gareca");
        Administrativo Tes =new Tesorero(45, "Bastian", "Shweinsteiger");
        Administrativo Con =new Contador(45, "Mario", "Gotze");
        Administrativo Ja =new Jefe_Area(45, "James", "Rodrigues");
        
        Personal1.add(Ger);
        Personal1.add(Tes);
        Personal1.add(Con);
        Personal1.add(Ja);
        
        System.out.println("Personal Administrativos asen esto en un dia nomal");
        for(Administrativo Personal1 : Personal1){
            System.out.println(Personal1.getEdad()+" "+Personal1.getNombre()+" "+Personal1.getApellidos()+" ");
            Personal1.universidad();
            Personal1.trabajar();
            Personal1.asistirtrabajo();
            System.out.println(" ");
        }
    }
    
}
