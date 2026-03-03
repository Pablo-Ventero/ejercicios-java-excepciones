package Multicatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());//Podria lanzar NullPointerException
            
            int[]numeros = {1, 2, 3};
            System.out.println(numeros[5]);//Podria lanzar ArrayIndexOutOfBoundsException
            
            Path archivo = Paths.get("no_existe.txt");
            Files.readAllBytes(archivo);//Podria lanzar IOException
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de acceso a datos: "+ e.getMessage());
        } catch (IOException e){
            System.out.println("Error de entrada/salida: "+ e.getMessage());
        } catch (Exception e){
            System.out.println("Error inesperado: "+ e.getMessage());
        }
        
        System.out.println("Final del programa...");
    }
}
