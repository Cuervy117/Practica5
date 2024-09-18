public class Principal{
    public static void main(String [] args){
        Libreria gandhi = new Libreria("Gandhi", "Coapa", "1234","08:00-14:00" );
        System.out.println(gandhi.getHorario());
        Libro libro1 = new ("Rayuela", 1963, "Cortazar", 2000);
        gandhi.agregarlibro(libro1);
    }
}