package salario_liquido;

public class Calculo_Salario {

    private double SalarioBruto;
    private double NDependentes;
    private double ValorDp;
    private double Pensao;
    private double Previdencia;

    private double IR;
    private double INSS;
    private double DescDp;
    private double DescPensao;
    private double DescPrevidencia;

    private double SalarioLiquido;

    //Construtor
    public Calculo_Salario() {
        limpar();
    }

    public void limpar() {
        SalarioBruto = 0;
        NDependentes = 0;
        ValorDp = 0;
        Pensao = 0;
        Previdencia = 0;
        IR = 0;
        INSS = 0;
        DescDp = 0;
        DescPensao = 0;
        DescPrevidencia = 0;
        SalarioLiquido = 0;
    }

    public double getSalarioBruto() {
        return SalarioBruto;
    }

    public double getSalarioLiquido() {
        return SalarioLiquido;
    }

    public void setSalarioLiquido(double SalarioLiquido) {
        this.SalarioLiquido = SalarioLiquido;
    }

    public double getNDependentes() {
        return NDependentes;
    }

    public void setNDependentes(double NDependentes) {
        this.NDependentes = NDependentes;
    }

    public double getValorDp() {
        return ValorDp;
    }

    public void setValorDp(double ValorDp) {
        this.ValorDp = ValorDp;
    }

    public double getPensao() {
        return Pensao;
    }

    public void setPensao(double Pensao) {
        this.Pensao = Pensao;
    }

    public double getPrevidencia() {
        return Previdencia;
    }

    public void setPrevidencia(double Previdencia) {
        this.Previdencia = Previdencia;
    }

    public double getIR() {
        return IR;
    }

    public double getINSS() {
        return INSS;
    }

    public double getDescDp() {
        return DescDp;
    }

    public double getDescPensao() {
        return DescPensao;
    }

    public double getDescPrevidencia() {
        return DescPrevidencia;
    }

    public void CalcularDescontos() {
        
        INSS();
        DescDp();
        DescPensao();
        DescPrevidencia();
        IR();
        
    }

    private void IR() {
    }

    private void INSS() {
        if (SalarioBruto <= 1556.94) {
            INSS = SalarioBruto * 8/100;
        }else{if (SalarioBruto <= 2094.92 ) {
                INSS = SalarioBruto * 9/100;
            }else{if (SalarioBruto <= 5189.82) {
                INSS = SalarioBruto * 11/100;
            }else{
                INSS = 5189.82 * 11 / 100;
            }
}
}
    }

    private void DescDp() {
        DescDp = NDependentes * ValorDp;
    }

    private void DescPensao() {
        DescPensao = Pensao;
    }

    private void DescPrevidencia() {
        DescPrevidencia = Previdencia;
    }

}
