import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Scanner;
import static spark.Spark.*;
public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {

            port(getHerokuAssignedPort());
            staticFileLocation("/public");
         //   String layout = "templates/layout.hbs";
        staticFileLocation("/public");
        get( "/",((request, response) -> {

            return modelAndView(new HashMap<>(),"index.hbs");
        }),new HandlebarsTemplateEngine());
    }
}













//        Scanner scanner= new Scanner(System.in);
//
//        System.out.println("Welcome to the Cipher App");
//        System.out.println("Enter a Message" );
//        String word = scanner.nextLine();
//
//        MessageCipher messageCipher= new MessageCipher();
//        System.out.println("Your Ciphered word is:");
//        System.out.println(messageCipher.cipherWord(word));
