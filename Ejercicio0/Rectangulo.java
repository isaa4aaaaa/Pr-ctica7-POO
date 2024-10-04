package mx.unam.fi.poo.g1.p70;

public class Rectangulo extends Figura{
    private double base,altura;

    public Rectangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double area(){
        return this.base * this.altura;
    }

    @Override
    public String toString(){
        return "El área del rectángulo es: " + this.area();
    }

}
