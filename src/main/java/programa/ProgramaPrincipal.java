package programa;

import java.util.Scanner;

import static programa.EscolhaUsuario.escolhaDoUsurario;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("BEM VINDO AO SISTEMA DE PAPELARIA");
        System.out.println("----------------------------------");
        int escolha = 0;
        do {
            System.out.println("- Para cadastrar digite '1'");
            System.out.println("- Para consultar digite '2'");
            System.out.println("- Para listar todos os pedidos digite '3'");
            System.out.println("- Para sair do programa digite '4'");
            escolha = teclado.nextInt();
            teclado.nextLine();

            escolhaDoUsurario(escolha);

        } while (escolha != 4);

    }
}
