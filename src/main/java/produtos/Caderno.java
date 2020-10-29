package produtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

import static utils.Utils.cadernos;
import static utils.Utils.totalValorPedido;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Caderno extends Produto implements Manipulacao {

    private Integer qtdFolhas;
    private String tamanho;
    private String tipo;
    private boolean capadura;

    public Boolean cadastro() {
        Scanner teclado = new Scanner(System.in);
        Caderno cadernoCadastrado = new Caderno();

        System.out.println("Digite a quantidade de folhas do caderno: ");
        cadernoCadastrado.setQtdFolhas(teclado.nextInt());
        teclado.nextLine();

        System.out.print("Digite o tamanho do caderno: \n");
        cadernoCadastrado.setTamanho(teclado.nextLine());

        System.out.println("Digite o tipo de caderno: ");
        cadernoCadastrado.setTipo(teclado.nextLine());

        System.out.println("O caderno é capadura? Digite 'true' pra sim e 'false' pra não.");
        cadernoCadastrado.setCapadura(teclado.nextBoolean());
        teclado.nextLine();

        System.out.println("Digite a marca: ");
        cadernoCadastrado.setMarca(teclado.nextLine());

        System.out.println("Digite o preço: R$");
        cadernoCadastrado.setValor(teclado.nextFloat());
        teclado.nextLine();
        totalValorPedido += cadernoCadastrado.getValor();

        cadernos.add(cadernoCadastrado);
        System.out.println("\nCaderno cadastrado com sucesso!!!");
        return true;
    }

    public String consulta() {
        return "Caderno{" +
                "qtdFolhas=" + qtdFolhas +
                ", tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capadura=" + capadura +
                ", marca= " + marca +
                ", valor= R$" + valor +
                '}';
    }
}
