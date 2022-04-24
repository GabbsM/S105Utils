package Nivel3;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.rmi.server.ExportException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

public class Principal {

    public static void main(String[] args) {

        File ruta = new File("C:\\Users\\Foo\\developer\\Lol.txt");
        Principal principal = new Principal();
        principal.encriptar(String.valueOf(ruta));


    }

    // Clave de encriptación / desencriptar

    File ruta = new File("C:\\Users\\Foo\\developer\\Lol.txt");

    public SecretKeySpec crearClave(String ruta){
        try {
            byte [] cadena = ruta.getBytes(StandardCharsets.UTF_8);
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena,16);
            SecretKeySpec sks = new SecretKeySpec(cadena,"AES");

            return sks;

        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }


    // Encriptar

    public String encriptar(String encriptar){
     try {
         SecretKeySpec sks = crearClave(String.valueOf(ruta));
         Cipher cipher = Cipher.getInstance("AES");
         cipher.init(Cipher.ENCRYPT_MODE,sks);

         byte [] cadena  = encriptar.getBytes(StandardCharsets.UTF_8);
         byte [] encriptada  = cipher.doFinal(cadena);
         String cadenaEncriptada = Base64.getEncoder().encodeToString(encriptada);
         return cadenaEncriptada;



     }catch (Exception e){
         e.printStackTrace();
         return null;
     }
    }

    //Desencriptar

    public String desencriptar(String desencriptar){
        try {
            SecretKeySpec sks = crearClave(String.valueOf(ruta));
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE,sks);

            byte [] cadena  = desencriptar.getBytes(StandardCharsets.UTF_8);
            byte [] encriptada  = cipher.doFinal(cadena);
            String cadenaDesencriptada = Base64.getEncoder().encodeToString(encriptada);
            return cadenaDesencriptada;


        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
