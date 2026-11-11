import java.util.Scanner;

public static void permutar(String palavra, String resultado) {

    if (palavra.length() == 0) {
        System.out.println(resultado);
    } else {
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            String restante = palavra.substring(0, i) + palavra.substring(i + 1);
            permutar(restante, resultado + letra);

        }
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma string: ");
    String input = scanner.nextLine();

    permutar(input, "");
}
