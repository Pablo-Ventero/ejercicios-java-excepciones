package EjercicioExamen4;

public class MatriculaInvalidaException extends Exception {
    public MatriculaInvalidaException(){
        System.out.println("No valida");
    }
    public MatriculaInvalidaException(String mensaje){
        super(mensaje);
    }
}
