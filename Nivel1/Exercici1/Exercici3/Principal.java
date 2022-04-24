package Nivel1.Exercici1.Exercici3;
import java.io.FileNotFoundException;
import java.util.Arrays;

//Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el
// resultat en un fitxer txt.

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Arrays.asList(args));

        Archivos2 archivos2 = new Archivos2();
        archivos2.crearTxt();



    }
}


