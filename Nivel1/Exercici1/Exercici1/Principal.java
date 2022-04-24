package Nivel1.Exercici1.Exercici1;

//Exercici 1.
//Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

import Nivel1.Exercici1.Exercici1.Directorio;

import java.io.File;

public class Principal {
    public static void main(String[] args) {

        Directorio directorio = new Directorio();
        directorio.mostrarDirectorio(new File("C:\\Windows"));


    }

}
