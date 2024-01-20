import java.util.Scanner;

public class AppMercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] valorLogin = {"emerson", "gustavo", "marcia", "helio", "freddy"};

        while (true) {
            System.out.println("Seja bem vindo!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastrar");
            System.out.println("3 - Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Por favor, digite seu login e senha:");
                String login = obterLogin(sc, valorLogin);
                //String senha = obterSenha(sc);
            } else if (opcao == 2) {
                System.out.println("Você escolheu cadastrar");
            } else if (opcao == 3) {
                System.out.println("Você escolheu sair");
                break;
            }
        }

    }

    // Método do Login:
    public static String obterLogin(Scanner sc, String[] logins) {
        System.out.println("Login:");
        String login = sc.next();
        while (!loginEncontrado(logins, login)){
            System.out.println("Login incorreto, digite novamente!");
            login = sc.next();
        }
        System.out.println("Logado com sucesso!");
        return login;
    }
    //Método para usar no método do login:
    public static boolean loginEncontrado(String[] vetorLogin, String nomeLogin){
        for (int i = 0; i < vetorLogin.length; i++) {
            if(vetorLogin[i].equals(nomeLogin)){
                return true;
            }
        }
        return false;
    }

    //Método de senha:
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















