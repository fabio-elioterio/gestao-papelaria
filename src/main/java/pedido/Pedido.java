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

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
@Builder
public class Pedido implements Manipulacao {

    private Data data;
    private Cliente cliente;
    private float totalPedido;
    private ArrayList<CaixaLapis> caixaLapis;
    private ArrayList<Papel> papeis;
    private ArrayList<Caderno> cadernos;

    public boolean cadastro() {
        return false;
    }

    public String consulta() {
        return "Pedido{" +
                "data=" + data +
                ", cliente=" + cliente +
                ", totalPedidos=" + totalPedido +
                ", caixaLapis=" + caixaLapis +
                ", papeis=" + papeis +
                ", cadernos=" + cadernos +
                '}';
    }
}
