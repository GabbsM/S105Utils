package Nivel1.Exercici1.Exercici1;

import java.io.File;

public class Directorio {

    public void mostrarDirectorio(File ruta){

        ruta = new File("C:\\Users\\Foo");
        System.out.println(ruta.getAbsolutePath());
        String[] nombreArchivos = ruta.list();

        for (int i = 0; i < nombreArchivos.length; i++) {
            System.out.println(nombreArchivos[i]);

        }
    }
}
