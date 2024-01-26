import java.util.Scanner;

public class Login {

    public static String[] filtrarNomes(String[][] usuarios) {
        String[] nomes = new String[usuarios.length];
        for (int i = 0; i < usuarios.length; i++) {
            nomes[i] = usuarios[i][0];
        }
        return nomes;
    }

    // Método do Login:
    public static String obterLogin(Scanner sc, String[] logins) {
        System.out.println("Login:");
        String login = sc.next();
        while (!loginEncontrado(logins, login)){
            System.out.println("Login incorreto, digite novamente!");
            login = sc.next();
        }
        return login;
    }
    //Método booleano para usar no método do login:
    public static boolean loginEncontrado(String[] vetorLogin, String nomeLogin){
        for (int i = 0; i < vetorLogin.length; i++) {
            if(vetorLogin[i].equals(nomeLogin)){
                return true;
            }
        }
        return false;
    }

    //Método de senha:
    public  static void confereSenha(Scanner sc, String[][] senhas, String login){
        System.out.println("Senha:");
        String senha = sc.next();
        while (!encontrarSenha(senhas, senha, login)){
            System.out.println("Senha incorreta, digite novamente!");
            senha = sc.next();
        }
    }

    //Método booleano para usar no método senha:
    public static boolean encontrarSenha(String[][] usuarios, String valorSenha, String login){
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
