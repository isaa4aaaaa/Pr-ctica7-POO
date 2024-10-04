package mx.unam.fi.poo.g1.p71;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Se crea un objeto CuentaBanco (C/b No. CB1234)");
        CuentaBanco CB1234 = new CuentaBanco("CB1234",500.00);
        System.out.println("Se depositan $1000 a la cuenta CB1234");
        CB1234.depositar(1000.0);
        System.out.println("Saldo nuevo: "+CB1234.getSaldo());
        System.out.println("Se retiran $600 de la cuenta CB1234");
        CB1234.retirar(600.00);
        System.out.println("Saldo nuevo: "+CB1234.getSaldo());
        System.out.println("\nCreando un objeto CuentaAhorro (C/a No. CA1000) con un saldo de $400.");
        CuentaAhorro CA1000 = new CuentaAhorro("CA1000",400.00);
        System.out.println("Se retiran $300 de la cuenta CA1000");
        CA1000.retirar(300.00);
        System.out.println("Saldo nuevo: "+CB1234.getSaldo());
        System.out.println("\n Creando un objeto CuentaAhorro (C/a No. CA1001) con un saldo de $300.");
        CuentaAhorro CA1001 = new CuentaAhorro("CA1001", 300);
        CA1001.retirar(250.0);
        System.out.println("Sueldo actual; " + CA1001.getSaldo());

    }
}
