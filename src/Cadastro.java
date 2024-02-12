import java.util.Scanner;

public class Cadastro {


    public static void cadastrarUsuario(Usuario[] usuario, Scanner sc, int contador){
        if(contador >= usuario.length){
            System.out.println("Limite de cadastro excedido!");
        }else {
            Usuario userObjeto = new Usuario();
            System.out.println("Digite seu nome:");
            String nome = sc.next();
            userObjeto.nome = nome;
            System.out.println("Digite sua senha:");
            String senha = sc.next();
            userObjeto.senha = senha;
            usuario[contador] = userObjeto;
        }
    }

}
