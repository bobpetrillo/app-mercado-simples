import java.util.Scanner;

public class AppMercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        while (true) {
            System.out.println("Seja bem vindo!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastrar");
            System.out.println("3 - Sair");

            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    String[] valorLogin = Login.filtrarNomes(BancoDeDados.usuarios);
                    if(BancoDeDados.contador == 0){
                        System.out.println("Não existem usuários, favor fazer novo cadastro");
                    }else {
                        System.out.println("Por favor, digite seu login e senha:");
                        String login = Login.obterLogin(sc, valorLogin);
                        Login.confereSenha(sc, BancoDeDados.usuarios, login);
                        System.out.println("Logado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Cadastrar usuário");
                    Cadastro.cadastrarUsuario(BancoDeDados.usuarios, sc, BancoDeDados.contador);
                    BancoDeDados.contador++;
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("Você escolheu sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }

    }

}
