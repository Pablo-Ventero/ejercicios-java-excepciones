package EjercicioExamen3;

public class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(){
        System.out.println("No hay dinero suficiente");    
    }
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}
