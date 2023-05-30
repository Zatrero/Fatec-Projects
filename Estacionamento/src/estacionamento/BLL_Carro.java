package estacionamento;

public class BLL_Carro {

    private String placa;
    private String cor;
    private String descricao;

    // construtor
    public BLL_Carro() {
        this.placa = "";
        this.cor = "";
        this.descricao = "";
    }
    // Metodos modficadores/acessores - SET's e GET's

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
