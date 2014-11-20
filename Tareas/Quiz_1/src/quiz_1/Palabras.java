/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_1;

/**
 *
 * @author Nerea
 */
public class Palabras {

    char abecedarioMin[] = new char[52];

    public void Minuscula() {
        abecedarioMin[0] = 'a';
        abecedarioMin[1] = 'b';
        abecedarioMin[2] = 'c';
        abecedarioMin[3] = 'd';
        abecedarioMin[4] = 'e';
        abecedarioMin[5] = 'f';
        abecedarioMin[6] = 'g';
        abecedarioMin[7] = 'h';
        abecedarioMin[8] = 'i';
        abecedarioMin[9] = 'j';
        abecedarioMin[10] = 'k';
        abecedarioMin[11] = 'l';
        abecedarioMin[12] = 'm';
        abecedarioMin[13] = 'n';
        abecedarioMin[14] = 'o';
        abecedarioMin[15] = 'p';
        abecedarioMin[16] = 'q';
        abecedarioMin[17] = 'r';
        abecedarioMin[18] = 's';
        abecedarioMin[19] = 't';
        abecedarioMin[20] = 'u';
        abecedarioMin[21] = 'v';
        abecedarioMin[22] = 'w';
        abecedarioMin[23] = 'x';
        abecedarioMin[24] = 'y';
        abecedarioMin[25] = 'z';

        abecedarioMin[26] = 'A';
        abecedarioMin[27] = 'B';
        abecedarioMin[28] = 'C';
        abecedarioMin[29] = 'D';
        abecedarioMin[30] = 'E';
        abecedarioMin[31] = 'F';
        abecedarioMin[32] = 'G';
        abecedarioMin[33] = 'H';
        abecedarioMin[34] = 'I';
        abecedarioMin[35] = 'J';
        abecedarioMin[36] = 'K';
        abecedarioMin[37] = 'L';
        abecedarioMin[38] = 'M';
        abecedarioMin[39] = 'N';
        abecedarioMin[40] = 'O';
        abecedarioMin[41] = 'P';
        abecedarioMin[42] = 'Q';
        abecedarioMin[43] = 'R';
        abecedarioMin[44] = 'S';
        abecedarioMin[45] = 'T';
        abecedarioMin[46] = 'U';
        abecedarioMin[47] = 'V';
        abecedarioMin[48] = 'W';
        abecedarioMin[49] = 'X';
        abecedarioMin[50] = 'Y';
        abecedarioMin[51] = 'Z';
    }

    public int[] insercion(int[] arreglo, String[] words) {
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i - 1] > arreglo[i]) {
                for (int j = i; j >= 1; j--) {
                    int numero = arreglo[j - 1];
                    String lastWord = words[j - 1];
                    if (numero > arreglo[j]) {
                        String supp = words[j];
                        words[j] = lastWord;
                        words[j - 1] = supp;
                        int auxiliar = arreglo[j];
                        arreglo[j] = numero;
                        arreglo[j - 1] = auxiliar;
                    }
                }
            }
        }
        return arreglo;
    }

    public int addPositions(String word) {
        int additionPositions = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < abecedarioMin.length; j++) {
                if (word.charAt(i) == abecedarioMin[j]) {
                    additionPositions += j;
                    break;
                }
            }
        }
        return additionPositions;
    }

    public static void main(String[] args) {
        Palabras t = new Palabras();
        Scanner teclado = new Scanner(System.in);
        t.defineMin();
        int[] addPositions = new int[5];
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite una palabra");
            String word = teclado.next();
            addPositions[i] = t.addPositions(word);
            words[i] = word;
        }
        addPositions = t.insercion(addPositions, words);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + "\n");
        }

    }
}
