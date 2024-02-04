import java.util.Scanner;

public class Login {

    /**
     * Método utilizado para filtrar os valores (nomes) da coluna 0
     * de uma matriz que contem login e senha.
     * @param usuarios: recebe uma matriz bidimensional do tipo String,
     * que contém na coluna 0 os nomes dos logins, e na coluna 1 as senhas de cada usuário.
     * Retorno: retorna o resultado da busca apenas pela coluna 0 da matriz.
     */
    public static String[] filtrarNomes(String[][] usuarios) {
        String[] nomes = new String[usuarios.length];
        for (int i = 0; i < usuarios.length; i++) {
            nomes[i] = usuarios[i][0];
        }
        return nomes;
    }

    /**
     * Método utilizado para receber um valor de acesso de login,
     * que compara com o banco de dados, através do método chamado "loginEncontrado",
     * se o login é existente ou não, retornando um tipo String.
     * @param sc: recebe o objeto Scanner criar um tipo String e receber um nome de login;
     * @param logins: criação da variável String para receber o sc.
     * @return: retorna o login correto, fazendo a comparação através do método
     * que está dentro do while.
     */
    public static String obterLogin(Scanner sc, String[] logins) {
        System.out.println("Login:");
        String login = sc.next();
        while (!loginEncontrado(logins, login)){
            System.out.println("Login incorreto, digite novamente!");
            login = sc.next();
        }
        return login;
    }

    /**
     * Método booleano utilizado para percorrer um array e comparar se o valor
     * está correto ou não.
     * @param vetorLogin: recebe um array do tipo String
     * @param nomeLogin: recebe uma String para ser comparada com o array
     * @return: retorna o resultado da comparação dos parâmetros.
     */
    public static boolean loginEncontrado(String[] vetorLogin, String nomeLogin){
        for (int i = 0; i < vetorLogin.length; i++) {
            if(vetorLogin[i] != null && vetorLogin[i].equals(nomeLogin)){
                return true;
            }
        }
        return false;
    }

    /**
     * Método sem retorno que faz a conferência da matriz senha com o valor que
     * contém no array login, chamando o método "ecnontrarSenha".
     * @param sc: recebe o objeto Scanner para que o usuário possa digitar o valor da senha;
     * @param senhas: recebe uma matriz para ser usada no método "encontrarSenha";
     * @param login: recebe um array para ser usado no método encontrarSenha.
     */
    public  static void confereSenha(Scanner sc, String[][] senhas, String login){
        System.out.println("Senha:");
        String senha = sc.next();
        while (!encontrarSenha(senhas, login, senha)){
            System.out.println("Senha incorreta, digite novamente!");
            senha = sc.next();
        }
    }

    /**
     * Método booleano que percorre uma matriz e compara seus valores de mesma linha
     * mas diferentes colunas, retornando verdadeiro ou falso.
     * @param usuarios: recebe uma matriz para ser percorrida e obter seus valores para comparação
     *                com os demais parâmetros;
     * @param login: variável String para ser armazenado o valor da primeira coluna de usuarios;
     * @param valorSenha: variável String para ser armazenado o valor da segunda coluna de usuarios;
     * @return: retorna o resultado da verificação da coluna 0 com a coluna 1, se a mesma linha
     * está igual ou não.
     */
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
