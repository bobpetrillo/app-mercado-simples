import java.util.Scanner;

public class AppMercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] valorLogin = {"emerson", "gustavo", "marcia", "helio", "freddy"};
        String[] valorSenha = {"eme123", "gus123", "mar123", "hel123", "fre123"};

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
                String senha = obterSenha(sc, valorSenha);
                System.out.println("Logado com sucesso!");
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
        while (!loginEncontrado(logins, login)) {
            System.out.println("Login incorreto, digite novamente!");
            login = sc.next();
        }
        return login;
    }

    //Método booleano para usar no método do login:
    public static boolean loginEncontrado(String[] vetorLogin, String nomeLogin) {
        for (int i = 0; i < vetorLogin.length; i++) {
            if (vetorLogin[i].equals(nomeLogin)) {
                return true;
            }
        }
        return false;
    }

    //Método de senha:
    public static String obterSenha(Scanner sc, String[] senhas) {
        System.out.println("Senha:");
        String senha = sc.next();
        while (!encontrarSenha(senhas, senha)) {
            System.out.println("Senha incorreta, digite novamente!");
            senha = sc.next();
        }
        return senha;
    }
    //Método booleano para usar no método da senha:
    public static boolean encontrarSenha(String[] vetorSenha, String valorSenha){
        for (int i = 0; i < vetorSenha.length; i++) {
            if (vetorSenha[i].equals(valorSenha)) {
                return true;
            }
        }
        return false;
    }




}















