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
        while (!login.equals("emerson")){
            System.out.println("Login incorreto!");
            login = sc.nextLine();
        }
        return login;
    }

    public  static String obterSenha(Scanner sc){
        System.out.println("Senha");
        String senha = sc.nextLine();
        while (!senha.equals("123")){
            System.out.println("Senha incorreta!");
            senha = sc.nextLine();
        }
        return senha;
    }




}















