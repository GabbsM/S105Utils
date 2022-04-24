package Nivel1.Exercici1.Exercici4;
//Afegeix la funcionalitat de llegir qualsevol fitxer txt i mostrar el seu contingut per consola.
public class Principal {

    public static void main(String[] args) {
        LecturaTxt lecturaTxt = new LecturaTxt();
        System.out.println(lecturaTxt.leerTxt("C:\\Users\\Foo\\developer\\Lol.txt"));
    }


}
