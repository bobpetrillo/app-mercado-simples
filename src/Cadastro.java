import java.util.Scanner;

public class Cadastro {


    public static String[][] cadastrarUsuario(String [][] usuarios, Scanner sc, int contador){
        if(contador >= 5){
            System.out.println("Limite de cadastro excedido!");
        }else {
            System.out.println("Digite um nome:");
            String nome = sc.next();
            usuarios[contador][0] = nome;
            System.out.println("Digite uma senha:");
            String email = sc.next();
            usuarios[contador][1] = email;
        }
        return usuarios;
    }




}
