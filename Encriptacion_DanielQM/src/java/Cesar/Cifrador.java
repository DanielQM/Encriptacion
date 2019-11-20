package Cesar;

public class Cifrador {

    private static int desplazamientoN = 0;
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

    public char getTextoCifrado(char parTextoClaro) {
        int indiceX = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoClaro == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }
        return tablaCesar[(indiceX + getDesplazamientoN() % 27) % 27];
    }

    private int getDesplazamientoN() {
        return desplazamientoN;
    }

    public void setDesplazamientoN(int desplazamientoN) {
        this.desplazamientoN = desplazamientoN;
    }
}
