package EjercicioExamen4;

public class Principal {
    public static void main(String[] args) {
        Validador validador = new Validador();
        
        // Probamos con una matrícula incorrecta
        String miMatricula = "123ABCDE"; // Tiene 8 caracteres, fallará

        try {
            System.out.println("Iniciando validación...");
            validador.validar(miMatricula);
            
        } catch (MatriculaInvalidaException e) {
            // Capturamos nuestra excepción personalizada
            System.err.println("Se ha producido un error: " + e.getMessage());
        } finally {
            System.out.println("Proceso de validación finalizado.");
        }
    }
}
