package complex;

public class Punto {
    double valorA;
    double valorB;
    public Punto(double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
    }
    public Punto(){
        valorA = 0;
        valorB = 0;
    }
    public double norma(){
        return Math.sqrt(Math.pow(valorA,2)+Math.pow(valorB,2));
    }
    public Punto complemento(){
        return new Punto(valorA,-valorB);
    }
    public double re(){
        return valorA;
    }
    public void re(double valorA){
        this.valorA = valorA;
    }
    public double im(){
        return valorB;
    }
    public void im(double valorB){
        this.valorB = valorB;
    }

}
