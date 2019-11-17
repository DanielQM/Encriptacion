package prueba;

import metodo.Sustitucion;

public class Pruebas {

    public static void main(String[] args) {

        Sustitucion sustitucion = new Sustitucion();

        int desplazamiento = 1;//Para cualquier valor de desplazamiento
        sustitucion.setDesplazamientoNCifrador(desplazamiento);
        System.err.println("Encriptamos el texto claro...");
        String textoClaro = "DANIEL";
        String textoCifrado = sustitucion.encriptarTextoClaro(textoClaro);
        System.out.println(textoCifrado);
        
        System.err.println("Ahora desencriptamos el resultado que nos dio la encriptación anterior...");
        sustitucion.setDesplazamientoNDescifrador(desplazamiento);
        System.out.println(sustitucion.desencriptarTextoCifrado(textoCifrado));
    }

}
