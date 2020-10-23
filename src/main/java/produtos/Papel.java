package produtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public boolean cadastro() {
        return false;
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
