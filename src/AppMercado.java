import java.util.Scanner;

public class AppMercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] usuarios = {
                {"emerson", "eme123"},
                {"gustavo", "gus123"},
                {"marcia", "mar123"},
                {"helio", "hel123"},
                {"freddy", "fre123"}
        };

        String[] valorLogin = Login.filtrarNomes(usuarios);

        while (true) {
            System.out.println("Seja bem vindo!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastrar");
            System.out.println("3 - Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Por favor, digite seu login e senha:");
                String login = Login.obterLogin(sc, valorLogin);
                Login.confereSenha(sc, usuarios, login);
                System.out.println("Logado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Você escolheu cadastrar");
            } else if (opcao == 3) {
                System.out.println("Você escolheu sair");
                break;
            }
        }

    }



}
