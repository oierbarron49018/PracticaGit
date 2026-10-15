import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase");
        StringBuilder cadena = new StringBuilder(sc.nextLine());
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        System.out.println(deleteChar(cadena, num));
    }

    public static String deleteChar(StringBuilder cadena, int num) {
        return cadena.deleteCharAt(num).toString();
    }
}

