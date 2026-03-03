package EjercicioExamen3;

public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(500);

        try {
            cuenta.retirar(600); // Esto fallará
        } catch (FondosInsuficientesException e) {
            System.out.println("Error en la transacción: " + e.getMessage());
        }
    }
}
