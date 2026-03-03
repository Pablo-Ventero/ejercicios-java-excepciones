package ExcepcionProcesadorTexto;

public class DatoInvalidoException extends Exception {
    //Constructor con mensaje
    public DatoInvalidoException(String mensaje){
        super(mensaje);
    }
    
    //Constructor con mensaje y causa
    //La causa es la excepcion que ocurrio originalmente
    public DatoInvalidoException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
