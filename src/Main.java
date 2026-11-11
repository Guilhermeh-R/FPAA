
import java.util.Scanner;

public static void acharPalavraEmUmCacaPalavra(
        String palavra, char[][] matriz, String resultado) {

    int[] direcaoLinha = { -1, -1, -1, 0, 0, 1, 1, 1 };
    int[] direcaoColuna = { -1, 0, 1, -1, 1, -1, 0, 1 };

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {

            if (matriz[i][j] == palavra.charAt(0)) {

                for (int d = 0; d < 8; d++) {

                    int k;

                    for (k = 0; k < palavra.length(); k++) {

                        int novaLinha = i + k * direcaoLinha[d];
                        int novaColuna = j + k * direcaoColuna[d];

                        if (novaLinha < 0 ||
                                novaLinha >= matriz.length ||
                                novaColuna < 0 ||
                                novaColuna >= matriz[0].length ||
                                matriz[novaLinha][novaColuna] != palavra.charAt(k)) {

                            break;
                        }
                    }

                    if (k == palavra.length()) {
                        System.out.println("Palavra encontrada!");
                        System.out.println("Linha: " + i);
                        System.out.println("Coluna: " + j);
                        return;
                    }
                }
            }
        }
    }

    System.out.println("Palavra não encontrada!");
}

public static void main(String[] args) {

    char[][] matriz = {
            { 'C', 'A', 'S', 'A' },
            { 'B', 'O', 'L', 'A' },
            { 'G', 'A', 'T', 'O' },
            { 'P', 'A', 'T', 'O' }
    };

    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite a palavra: ");
    String palavra = teclado.nextLine().toUpperCase();

    acharPalavraEmUmCacaPalavra(palavra, matriz, "");

    teclado.close();
}
