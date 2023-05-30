package notasponderadas;

public class Calculo_Nota {

    // variaveis de instancia de entrada
    // coluna de checknox
    private boolean Check_n1;
    private boolean check_n2;
    private boolean check_n3;
    private boolean check_n4;
    private boolean check_n5;
    // coluna das notas
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;
    // coluna dos pesos
    private double peso1;
    private double peso2;
    private double peso3;
    private double peso4;
    private double peso5;
    // variaveis de isntacia de saida
    private double mediaFinal;
    private double totalDosPesos;

    // variaveis de isntancia de negocios
    private boolean calculoTemPeso;
    private String status;

    public Calculo_Nota() {
        limpar();
    }

    public void limpar() {
        this.Check_n1 = true;
        this.check_n2 = true;
        this.check_n3 = false;
        this.check_n4 = false;
        this.check_n5 = false;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
        this.nota5 = 0;
        this.peso1 = 0;
        this.peso2 = 0;
        this.peso3 = 0;
        this.peso4 = 0;
        this.peso5 = 0;
        this.mediaFinal = 0;
        this.totalDosPesos = 0;
        this.calculoTemPeso = true;
        this.status = "";
    }

    // conceito de encapsulamento
    // set's/get's metoidos modificadores/acessores
    public boolean isCheck_n1() {
        return Check_n1;
    }

    public boolean isCbNota2() {
        return check_n2;
    }

    public boolean isCbNota3() {
        return check_n3;
    }

    public void setCbNota3(boolean cbNota3) {
        this.check_n3 = cbNota3;
    }

    public boolean isCheck_n4() {
        return check_n4;
    }

    public void setCheck_n4(boolean check_n4) {
        this.check_n4 = check_n4;
    }

    public boolean isCheck_n5() {
        return check_n5;
    }

    public void setCheck_n5(boolean check_n5) {
        this.check_n5 = check_n5;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }

    public double getPeso3() {
        return peso3;
    }

    public void setPeso3(double peso3) {
        this.peso3 = peso3;
    }

    public double getPeso4() {
        return peso4;
    }

    public void setPeso4(double peso4) {
        this.peso4 = peso4;
    }

    public double getPeso5() {
        return peso5;
    }

    public void setPeso5(double peso5) {
        this.peso5 = peso5;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public double getTotalDosPesos() {
        return totalDosPesos;
    }

    public boolean isCalculoTemPeso() {
        return calculoTemPeso;
    }

    public void setCalculoTemPeso(boolean calculoTemPeso) {
        this.calculoTemPeso = calculoTemPeso;
    }

    public String getStatus() {
        return status;
    }
    
    
    
    

    // regras de negocio
    public void calcularAMedia() {
        if (calculoTemPeso == true) {
            // instrcuções para calcular com peso
            if (isCheck_n1()==true && isCbNota2() && isCbNota3() && isCheck_n4()
                    && isCheck_n5()) {
                totalDosPesos = peso1 + peso2 + peso3 + peso4 + peso5;
                mediaFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3
                        + nota4 * peso4 + nota5 * peso5) / totalDosPesos;
            } else {
                if (isCheck_n1() && isCbNota2() && isCbNota3() && isCheck_n4()) {
                    totalDosPesos = peso1 + peso2 + peso3 + peso4;
                    mediaFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3
                            + nota4 * peso4) / totalDosPesos;
                } else {
                    if (isCheck_n1() && isCbNota2() && isCbNota3()) {
                        totalDosPesos = peso1 + peso2 + peso3;
                        mediaFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)
                                / totalDosPesos;
                    } else {
                        if (isCheck_n1() && isCbNota2()) {
                            totalDosPesos = peso1 + peso2;
                            mediaFinal = (nota1 * peso1 + nota2 * peso2) / totalDosPesos;
                        }
                    }
                }
            }
            
        } else {
            // INSTRUÇÕES PARA CALCULARSEM PESO

            if (isCheck_n1() && isCbNota2()) {
                mediaFinal = (nota1 + nota2) / 2;
            } else {
                if (isCheck_n1() && isCbNota2() && isCbNota3()) {
                    mediaFinal = (nota1 + nota2 + nota3) / 3;
                } else {
                    if (isCheck_n1() && isCbNota2() && isCbNota3() && isCheck_n4()) {
                        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
                    } else {
                        if (isCheck_n1() && isCbNota2() && isCbNota3() && isCheck_n4()
                                && isCheck_n5()) {
                            mediaFinal = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
                        }
                    }
                }
            }
        }
        if (mediaFinal >= 7.00) {
            status = "ALUNO APROVADO";
        }else{
            status = "ALUNO REPROVADO";
        }
    }
}
