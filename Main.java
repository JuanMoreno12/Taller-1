import java.util.*;

public class Main {
    public static void main(String[] args) {
        int total=0;
        boolean respuesta;
        boolean respuesta2;
        String letra="l";
        System.out.println("Sistema");
        
        Sistema objeto= new Sistema("");

        objeto.setCadena("loro");
        total=objeto.Funcionalidad1();
        respuesta=objeto.Funcionalidad2();
        respuesta2=objeto.Funcionalidad3(letra);
        System.out.println("Vocales para la cadena "+ objeto.getCadena() +" :" + total);

        if (respuesta == true) {
            System.out.println("La palabra "+ objeto.getCadena() +" es: par");
        }
        else
        {
            System.out.println("La palabra "+ objeto.getCadena() +" es: impar");
        }

        if (respuesta2 == true) {
            System.out.println("La palabra "+ objeto.getCadena() +" tiene la letra:" +  letra);
        }
        else
        {
            System.out.println("La palabra "+ objeto.getCadena() +" no tiene la letra:"+ letra);
        }
    }
}
