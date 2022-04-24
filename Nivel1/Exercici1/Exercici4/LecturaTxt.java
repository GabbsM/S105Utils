package Nivel1.Exercici1.Exercici4;
import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaTxt {

    public String  leerTxt(String ruta){

        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Foo\\developer\\Lol.txt"));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
            texto = temp;

        }catch (Exception e){

        }return texto;
    }
}
