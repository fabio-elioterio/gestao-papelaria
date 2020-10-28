package produtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pedido.Pedido;
import utils.Utils;

import java.util.Scanner;

import static utils.Utils.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Papel extends Produto implements Manipulacao {

    private String cor;
    private String tipo;
    private float largura;
    private float altura;
    private Integer gramatura;
    private boolean paltado;

    public Boolean cadastro() {
        Scanner teclado = new Scanner(System.in);
        Papel papelCadastrado = new Papel();

        System.out.println("Digite a cor do papel: ");
        papelCadastrado.cor = teclado.nextLine();

        System.out.println("Digite o tipo do papel: ");
        papelCadastrado.tipo = teclado.nextLine();

        System.out.println("Digite a largura do papel: ");
        papelCadastrado.largura = teclado.nextFloat();
        teclado.nextLine();

        System.out.println("Digite a altura do papel: ");
        papelCadastrado.altura = teclado.nextFloat();
        teclado.nextLine();

        System.out.println("Digite a gramatura do papel: ");
        papelCadastrado.gramatura = teclado.nextInt();
        teclado.nextLine();

        System.out.println("O papel é paltado? Digite 'true' pra sim e 'false' pra não.");
        papelCadastrado.paltado = teclado.nextBoolean();
        teclado.nextLine();

        System.out.println("Digite a marca: ");
        papelCadastrado.setMarca(teclado.nextLine());

        System.out.println("Digite o preço: R$");
        papelCadastrado.setValor(teclado.nextFloat());
        teclado.nextLine();
        totalValorPedido += papelCadastrado.getValor();

        papeis.add(papelCadastrado);
        System.out.println("Papel cadastrado com sucesso!!");
        return true;
    }

    public String consulta() {
        return "Papel{" +
                "cor= '" + cor + '\'' +
                ", tipo= '" + tipo + '\'' +
                ", largura= " + largura +
                ", altura= " + altura +
                ", gramatura= " + gramatura +
                ", paltado= " + paltado +
                ", marca= " + marca +
                ", valor= R$" + valor +
                '}';

    }
}
