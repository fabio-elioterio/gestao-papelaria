package utils;

import pedido.Pedido;
import produtos.Caderno;
import produtos.CaixaLapis;
import produtos.Papel;

import java.util.ArrayList;

public class Utils {

    public static ArrayList<Pedido> pedidosCadastrados = new ArrayList<Pedido>();
    public static ArrayList<CaixaLapis> caixaLapis = new ArrayList<CaixaLapis>();
    public static ArrayList<Caderno> cadernos = new ArrayList<Caderno>();
    public static ArrayList<Papel> papeis = new ArrayList<Papel>();
    public static float totalValorPedido;

    public static void consultaPedidos() {

        for (Pedido pedidosCadastrado : pedidosCadastrados) {
            System.out.println(
                    "\n***************************************" +
                            "\nPEDIDO: " +
                            "\nData: " + pedidosCadastrado.getData().consultaData() +
                            "\nCliente: " + pedidosCadastrado.getCliente() +
                            "\nValor Total do Pedido: R$" + pedidosCadastrado.totalPedido +
                            "\nCaixas de lápis" + pedidosCadastrado.caixasLapis +
                            "\nPapeis" + pedidosCadastrado.papeis +
                            "\nCadernos=" + pedidosCadastrado.cadernos +
                            "\n***************************************\n");


        }
    }

    public static ArrayList<CaixaLapis> consultaCaixaLapis() {
        return caixaLapis;
    }

    public static ArrayList<Caderno> consultaCaderno() {
        return cadernos;
    }

    public static ArrayList<Papel> consultaPapeis() {
        return papeis;
    }

}
