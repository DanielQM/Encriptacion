package RSA;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.Cipher;

public class EncriptadoRSA {

    private static Cipher rsa;

    public static void main(String[] args) throws Exception {
        // Generar el par de claves
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // Obtener la clase para encriptar/desencriptar
        rsa = Cipher.getInstance("RSA");

        // Texto a encriptar
        String text = "daniel";

        // Se encripta
        rsa.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encriptado = rsa.doFinal(text.getBytes());
        
        System.out.println("TEXTO ENCRIPTADO:");
        // Escribimos el encriptado para verlo, con caracteres visibles
        for (byte b : encriptado) {
            System.out.print(Integer.toHexString(0xFF & b));
        }
        System.out.println();

        // Se desencripta
        rsa.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] bytesDesencriptados = rsa.doFinal(encriptado);
        String textoDesencriptado = new String(bytesDesencriptados);

        // Se escribe el texto desencriptado
        System.out.println("TEXTO DESENCRIPTADO:");
        System.out.println(textoDesencriptado);

    }

}
