package produtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Caderno extends Produto implements Manipulacao {

    private Integer qtdFolhas;
    private String tamanho;
    private String tipo;
    private boolean capadura;

    Scanner teclado = new Scanner(System.in);

    public boolean cadastro() {
        Caderno cadernoCadastrado = new Caderno();

        System.out.println("Digite a quantidade de folhas do caderno: ");
        cadernoCadastrado.qtdFolhas = teclado.nextInt();

        System.out.println("Digite o tamanho do caerno: ");
        cadernoCadastrado.tamanho = teclado.next();

        System.out.println("Digite o tipo de caderno: ");
        cadernoCadastrado.tipo = teclado.next();

        System.out.println("O caderno é capadura?: ");
        cadernoCadastrado.capadura = teclado.nextBoolean();
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
