package retangulo;

public class Calcular_Retangulo {

    //Variaveis de entrada
    private double ladoA;
    private double ladoB;

    //Variaveis de calculo
    private double perimetro;
    private double area;

    //construtor
    public void Calcular_Retangulo() {
        limpar();
    }
    
    public void limpar(){
        ladoA = 0;
        ladoB = 0;
        perimetro = 0;
        area = 0;
    }

    //Métodos acessores/ modificadores    
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoA(double ladoA) {
        return this.ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoB(double ladoB) {
        return this.ladoB;
    }

    public double getPerimetro(double perimetro) {
        return this.perimetro;
    }

    public double getArea(double area) {
        return this.area;
    }
    
    //metodos de negocio
    public void calcularPerimetro(){
        this.perimetro = (this.ladoA * 2) + (this.ladoB * 2);
    }
    
    public void calcularArea(){
        this.area = this.ladoA * this.ladoB;
    }

}
