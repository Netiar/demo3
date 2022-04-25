import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Welcome to the Cipher App");
        System.out.println("Enter a Message" );
        String word = scanner.nextLine();

        MessageCipher messageCipher= new MessageCipher();
        System.out.println("Your Ciphered word is:");
        System.out.println(messageCipher.cipherWord(word));

    }
}
