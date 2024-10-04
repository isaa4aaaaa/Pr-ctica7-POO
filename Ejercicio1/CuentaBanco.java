package mx.unam.fi.poo.g1.p71;


public class CuentaBanco {

    private String numeroCuenta;
    private double saldo;

    public CuentaBanco(String numeroCuenta, double saldo){
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void retirar(double cantidad){
        if(this.getSaldo() >= cantidad){
            this.saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes...");
        }
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
    }

}
