//Formula usada do wikipedia
//(link)
//acesso em: 04/09/2020 as 10:30
package imc;

public class Calculo_IMC {

    //Declação de variáveis
    private double peso;
    private double altura;
    private double resultado;
    private String status;

    //Construtor
    public Calculo_IMC() {

        //Inicializa as variaveis
        limpar();
    }

    //Métodos
    //Encapsulamento das variaveis para manipulação 
    //Variaveis de entrada
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    //Variaveis de Saída
    public String getStatus() {
        return status;
    }

    //Métodos de Négocio
    public void limpar() {
        this.altura = 0;
        this.peso = 0;
        this.resultado = 0;
        this.status = "";
    }

    public void CalcularImc() {
        this.resultado = this.peso / Math.pow(altura, altura);

    }

    public void ExibeStatus() {
        if (resultado < 17) {
            this.status = "Muito abaixo do peso";
        } else {
            if (resultado >= 17 && resultado < 18.49) {
                this.status = "Abaixo do peso";
            } else {
                if (resultado >= 18.50 && resultado < 24.99) {
                    this.status = "Peso normal";
                } else {
                    if (resultado >= 25.00 && resultado < 29.99) {
                        this.status = "Acima do peso";
                    } else {
                        if (resultado >= 30 && resultado < 34.99) {
                            this.status = "Obesidade";
                        } else {
                            if (resultado <= 35.00 && resultado < 39.99) {
                                this.status = "Obesidade II (severa)";
                            } else {
                                this.status = "Obesidade III (morbida)";
                            }
                        }
                    }
                }
            }
        }
    }

}
