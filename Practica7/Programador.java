package mx.unam.fi.poo.g1.p7;

/**
 * Clase Programador extiende a Empleado
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Programador extends Empleado{

    /**
     * Método constructor para Programador.
     * @param nombre -> Para asignar el atributo nombre.
     * @param direccion -> Para asignar el atributo direccion.
     * @param trabajo -> Para asignar el atributo trabajo (nombre del trabajo).
     * @param salario -> Para asignar el atributo salario.
     */
    public Programador(String nombre, String direccion, String trabajo, int salario){
        super(nombre, direccion, trabajo, salario);
    }

    /**
     * Método para calcular el bono definido.
     * @return bono -> Regresa el bono calculado.
     */
    @Override
    public double calcularBono(){
        double bono = getSalario() * 0.10;
        setSalario(getSalario()+bono);
        return bono;
    }

    /**
     * Método apra generar el/a reporte de desempeño del programador/a.
     * @param desempeño -> Para definir el desempeño
     */
    @Override
    public void generarReporteDesempeño(String desempeño){
        System.out.println("Desempeño del/a programador/a "+ getNombre() +": "+ desempeño+"\n");
    }

    /**
     * Método para imprimir el proyecto del que forma parte el/a programador/a.
     */
    @Override
    public void manejoProyectos(){
        System.out.println("El/La programador@ " + getNombre() + " forma parte del proyecto: ");
        System.out.println("Modernización de las bibliotecas \"legacy\" de la compañía.");
    }
    
    
}
