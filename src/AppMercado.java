import java.util.Scanner;

public class AppMercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String login = obterLogin(sc);
        String senha = obterSenha(sc);

        System.out.println("Logado com sucesso!");


    }

    public static String obterLogin(Scanner sc) {
        System.out.println("Login");
        String login = sc.nextLine();
        while (login.length() <3){
            System.out.println("Digite um login que contenha mais de 3 caracteres!");
            login = sc.nextLine();
        }
        return login;
    }

    public  static String obterSenha(Scanner sc){
        System.out.println("Senha");
        String senha = sc.nextLine();
        while (senha.length() <3){
            System.out.println("Digite uma senha que contenha mais de 3 caracteres");
            senha = sc.nextLine();
        }
        return senha;
    }




}















