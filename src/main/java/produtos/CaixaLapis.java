package produtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CaixaLapis extends Produto implements Manipulacao {

    private Integer quantidade;
    private boolean colorido;

    public boolean cadastro() {
        return false;
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
