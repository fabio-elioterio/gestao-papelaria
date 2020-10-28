package programa;

import pedido.Pedido;

import static utils.Utils.consultaPedidos;

public class EscolhaUsuario {

    public static void escolhaDoUsurario(int escolha) {
        Pedido pedido = new Pedido();

        switch (escolha) {
            case 1:
                pedido.cadastro();
                break;
            case 2:
                System.out.println(pedido.consulta());
                break;
            case 3:
                consultaPedidos();
                break;
            case 4:
                System.out.println("Obrigado e até uma próxima.");
                break;
            default:
                System.out.println("Nenhum dos números solicitados foram digitados, por favor tente novamente.");
                break;
        }
    }
}