package produtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

import static utils.Utils.caixaLapis;
import static utils.Utils.totalValorPedido;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CaixaLapis extends Produto implements Manipulacao {

    private Integer quantidade;
    private boolean colorido;

    public Boolean cadastro() {
        Scanner teclado = new Scanner(System.in);

        CaixaLapis caixaLapisCadastrada = new CaixaLapis();

        System.out.println("Digite a quantidade de lápis: ");
        caixaLapisCadastrada.quantidade = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Os lapis são colorido? Digite 'true' pra sim e 'false' pra não.");
        caixaLapisCadastrada.colorido = teclado.nextBoolean();
        teclado.nextLine();

        System.out.println("Digite a marca: ");
        caixaLapisCadastrada.setMarca(teclado.nextLine());

        System.out.println("Digite o preço: R$");
        caixaLapisCadastrada.setValor(teclado.nextFloat());
        teclado.nextLine();
        totalValorPedido += caixaLapisCadastrada.getValor();

        caixaLapis.add(caixaLapisCadastrada);
        System.out.println("Caixa de lápis cadastrada com sucesso!!");
        return true;
    }

    public String consulta() {
        return "CaixaLapis{" +
                "quantidade=" + quantidade +
                ", colorido=" + colorido +
                ", marca= " + marca +
                ", valor= R$" + valor +
                '}';
    }

}
