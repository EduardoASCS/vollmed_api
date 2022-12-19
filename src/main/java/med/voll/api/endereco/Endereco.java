package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String uf;
    private String cidade;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.uf = dados.uf();
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
    }

    public void atualizar(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.logradouro();
        this.bairro = dadosEndereco.bairro();
        this.uf = dadosEndereco.uf();
        this.cep = dadosEndereco.cep();
        this.numero = dadosEndereco.numero();
        this.cidade = dadosEndereco.cidade();
        this.complemento = dadosEndereco.complemento();
    }
}
