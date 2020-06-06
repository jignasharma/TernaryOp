import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a alphabet : ");
        char c = scanner.next().charAt(0);

        // if given character is Lower case Vowel or Upper case Vowel
        // then print vowel otherwise consonant
        if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                || (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {

            System.out.println(c + " is a vowel.");

        } else {

            System.out.println(c + " is a consonant.");

        }
    }
}