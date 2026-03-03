package EjercicioExamen4;

public class Validador {
    public void validar(String texto) throws MatriculaInvalidaException{
        if (texto.length()!= 7) {
            throw new MatriculaInvalidaException("Error");
        }
        System.out.println("Correcto");
    }
}
