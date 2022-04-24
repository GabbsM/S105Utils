package Nivel1.Exercici1.Exercici3;

import java.io.*;

public class Archivos2 {

    public void crearTxt() throws FileNotFoundException {
        File ruta = new File("C:\\Users\\Foo\\developer");
        String[] nombreArchivos = ruta.list();

        try {
            FileWriter escritura = new FileWriter("C:\\Users\\Foo\\developer\\archivo.txt");
            String textodirectorio = String.valueOf(escritura);

            for (int i = 0; i < nombreArchivos.length; i++) {


                File f = new File(ruta.getAbsolutePath(), nombreArchivos[i]);
                if (f.isDirectory()) {
                    String[] archivosSubcarpeta = f.list();
                    escritura.write(textodirectorio.charAt(i));

                    for (int j = 0; j < archivosSubcarpeta.length; j++) {
                        escritura.write(textodirectorio.charAt(j));
                    }
                }
            }
            System.out.println("Archivo creado con exito");
            escritura.close();
        } catch (Exception e) {
        }

    }
}