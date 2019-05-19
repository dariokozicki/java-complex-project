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
    public double argumento() {
    	if (this.getRe()!=0) {
    	return Math.atan(this.getIm()/this.getRe());
    	}
    	if (this.getIm()<0){
    		return Math.PI*(3/2);
    	}
    	return Math.PI /2;
    }
    public Punto complemento(){
        return new Punto(valorA,-valorB);
    }
    public double getRe(){
        return valorA;
    }
    public void setRe(double valorA){
        this.valorA = valorA;
    }
    public double getIm(){
        return valorB;
    }
    public void setIm(double valorB){
        this.valorB = valorB;
    }

}
