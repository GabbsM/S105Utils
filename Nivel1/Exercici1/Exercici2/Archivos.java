package Nivel1.Exercici1.Exercici2;

import java.io.File;

public class Archivos {
    public void LeerRuta(){
        File ruta = new File("C:\\Users\\Foo\\developer");
        System.out.println(ruta.getAbsolutePath());

        String[]nombreArchivos = ruta.list();

        for (int i = 0; i < nombreArchivos.length ; i++) {
            System.out.println(nombreArchivos[i] + "(D) " + ruta.lastModified());

            File f = new File(ruta.getAbsolutePath(),nombreArchivos[i]);
            if(f.isDirectory()){
                String[]archivosSubcarpeta = f.list();

                for (int j = 0; j < archivosSubcarpeta.length ; j++) {
                    System.out.println(archivosSubcarpeta[j] + "(F) " + f.lastModified());

                }
            }
        }
    }
}
