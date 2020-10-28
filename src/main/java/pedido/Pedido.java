package pedido;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import pedido.cliente.Cliente;
import pedido.data.Data;
import produtos.Caderno;
import produtos.CaixaLapis;
import produtos.Manipulacao;
import produtos.Papel;

import java.util.ArrayList;
import java.util.Scanner;

import static utils.Utils.*;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
@Builder
public class Pedido implements Manipulacao {

    private Data data = new Data();
    private Cliente cliente = new Cliente();
    public float totalPedido;
    public static ArrayList<CaixaLapis> caixasLapis = new ArrayList<CaixaLapis>();
    public static ArrayList<Papel> papeis = new ArrayList<Papel>();
    public static ArrayList<Caderno> cadernos = new ArrayList<Caderno>();

    public Boolean cadastro() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Para Cadastrar um pedido digite:");
        System.out.println("O dia: ");
        this.data.setDia(teclado.nextInt());

        System.out.println("O mes(em número): ");
        data.setMes(teclado.nextInt());

        System.out.println("O ano: ");
        this.data.setAno(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Digite o nome do cliente: ");
        this.cliente.setNome(teclado.nextLine());

        System.out.println("Digite o cpf do cliente: ");
        this.cliente.setCpf(teclado.nextLine());

        System.out.println("Digite o telefone do cliente: ");
        this.cliente.setTelefone(teclado.nextLine());

        System.out.println("\n------------------------------");
        System.out.println("Para cadastrar um caderno digite:");
        new Caderno().cadastro();
        cadernos = consultaCaderno();

        System.out.println("\n------------------------------");
        System.out.println("Para cadastrar um papel digite:");
        new Papel().cadastro();
        Pedido.papeis = consultaPapeis();

        System.out.println("\n------------------------------");
        System.out.println("Para cadastrar uma caixa de lapis digite:");
        new CaixaLapis().cadastro();
        caixasLapis = consultaCaixaLapis();

        calculaTotalPedido();

        pedidosCadastrados.add(this);
        System.out.println("\nPedido cadastrado!!\n");
        return true;

    }

    public String consulta() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeASerConsultado = teclado.nextLine();

        if (pedidosCadastrados.isEmpty()) {
            return "Pedido não encontrado!";
        } else {
            for (Pedido pedidosCadastrado : pedidosCadastrados) {
                if (pedidosCadastrado.getCliente().getNome().equals(nomeASerConsultado)) {
                    return "\n***************************************" +
                            "\nPEDIDO: " +
                            "\nData: " + pedidosCadastrado.data.consultaData() +
                            "\nCliente: " + pedidosCadastrado.cliente +
                            "\nValor Total do Pedido: R$" + pedidosCadastrado.totalPedido +
                            "\nCaixas de lápis" + pedidosCadastrado.caixasLapis +
                            "\nPapeis" + pedidosCadastrado.papeis +
                            "\nCadernos=" + pedidosCadastrado.cadernos  +
                            "\n***************************************\n";
                }
            }
        }
        return "\nPedido não encontrado!\n";
    }

    public void calculaTotalPedido() {

        totalValorPedido += totalValorPedido * 0.18;
        this.totalPedido = totalValorPedido;


    }



}
