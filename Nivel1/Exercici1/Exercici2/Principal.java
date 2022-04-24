package Nivel1.Exercici1.Exercici2;
import java.io.File;
import java.util.Arrays;

//Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris
// amb el contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla
// en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i
// la seva última data de modificació.

public class Principal {

    public static void main(String[] args) {

        Archivos archivos = new Archivos();
        archivos.LeerRuta();
    }

}

