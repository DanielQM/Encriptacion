package Cesar;

public class Descifrador {

    private static int desplazamientoN = 0;
    
    //Tabla de las letras que se reemplazarán
    char tablaCesar[] = {
        'A', 'B', 'C', 'D', 'E',
        'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'Ñ',
        'O', 'P', 'Q', 'R', 'S',
        'T', 'U', 'V', 'W', 'X',
        'Y', 'Z', 'a', 'b', 'c',
        'd', 'e', 'f', 'g', 'h',
        'i', 'j', 'k', 'l', 'm',
        'n', 'ñ', 'o', 'p', 'q',
        'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z'
    };

    //Determinamos la longitud del cifrado y lo retornaremos
    public char getTextoClaro(char parTextoCifrado) {
        int indiceX = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoCifrado == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }
        return tablaCesar[(indiceX + (27 - getDesplazamientoN() % 27)) % 27];
    }

    private int getDesplazamientoN() {
        return desplazamientoN;
    }

    public void setDesplazamientoN(int desplazamientoN) {
        this.desplazamientoN = desplazamientoN;
    }
}
