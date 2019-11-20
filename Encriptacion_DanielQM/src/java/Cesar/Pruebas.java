package Cesar;

public class Pruebas {

    public static void main(String[] args) {

        Sustitucion sustitucion = new Sustitucion();

        int desplazamiento = 5;//Para cualquier valor de desplazamiento
        sustitucion.setDesplazamientoNCifrador(desplazamiento);
        System.out.println("TEXTO ENCRIPTADO:");
        String textoClaro = "Ss";
        String textoCifrado = sustitucion.encriptarTextoClaro(textoClaro);
        System.out.println(textoCifrado);
        
        System.out.println("TEXTO DESENCRIPTADO:");
        sustitucion.setDesplazamientoNDescifrador(desplazamiento);
        System.out.println(sustitucion.desencriptarTextoCifrado(textoCifrado));
    }

}
