import java.util.Scanner;

public class Login {

    public static boolean login(Scanner sc){
        System.out.println("Nome:");
        String nome = sc.next();
        System.out.println("Senha:");
        String senha = sc.next();
        for (int i = 0; i < BancoDeDados.contador; i++) {
            if (nome.equals(BancoDeDados.user[i].nome) && senha.equals(BancoDeDados.user[i].senha)){
                return true;
            }
        }
        System.out.println("Login ou senha incorretos, digite novamente:");
        return false;
    }


    public static String[] filtrarNomes(String[][] usuarios) {
        String[] nomes = new String[usuarios.length];
        for (int i = 0; i < usuarios.length; i++) {
            nomes[i] = usuarios[i][0];
        }
        return nomes;
    }

    public static String obterLogin(Scanner sc, String[] logins) {
        System.out.println("Login:");
        String login = sc.next();
        while (!loginEncontrado(logins, login)){
            System.out.println("Login incorreto, digite novamente!");
            login = sc.next();
        }
        return login;
    }

    public static boolean loginEncontrado(String[] vetorLogin, String nomeLogin){
        for (int i = 0; i < vetorLogin.length; i++) {
            if(vetorLogin[i] != null && vetorLogin[i].equals(nomeLogin)){
                return true;
            }
        }
        return false;
    }

    public  static void confereSenha(Scanner sc, String[][] senhas, String login){
        System.out.println("Senha:");
        String senha = sc.next();
        while (!encontrarSenha(senhas, login, senha)){
            System.out.println("Senha incorreta, digite novamente!");
            senha = sc.next();
        }
    }

    public static boolean encontrarSenha(String[][] usuarios, String login, String valorSenha){
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0].equals(login)) {
                if (usuarios[i][1].equals(valorSenha)){
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
