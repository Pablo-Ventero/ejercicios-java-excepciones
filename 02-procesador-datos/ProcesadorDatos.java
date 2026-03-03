package ExcepcionProcesadorTexto;

public class ProcesadorDatos {
    public int convertirTextoANumeros(String texto)throws DatoInvalidoException{
        try{
            //Intentamos convertir el texto a número
            return Integer.parseInt(texto);
        }catch(NumberFormatException e){
            //Si falla, lanzamos nuestra excepcion personalizada
            //Y si pasamos la NumberFormatException como causa 
            throw new DatoInvalidoException(
            "No se pudo convertir el texto a numero: "+texto, e);
        }
    }
}
