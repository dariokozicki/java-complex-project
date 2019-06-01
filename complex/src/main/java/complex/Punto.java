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
    	Double argumento= Math.atan((double) this.getIm()/this.getRe());
    		if(argumento<=0 && this.getIm()<0)//CuartoCuadrante 
    			return 2*Math.PI +argumento;
    		if(argumento<=0 && this.getRe()<0)//SegundoCuadrante
    			return Math.PI + argumento;
    		if(this.getIm()<0 && this.getRe()<0)//TercerCuadrante
    			return Math.PI + argumento;
    		return argumento;//PrimerCuadrante
    	}
    	if (this.getIm()<0){
    		return Math.PI*((double)3/2);
    	}
    	return (double) Math.PI /2;
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
