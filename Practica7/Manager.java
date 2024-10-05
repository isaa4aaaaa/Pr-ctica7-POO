package mx.unam.fi.poo.g1.p7;

/**
 * Clase Manager extiende a Empleado
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Manager extends Empleado {
   /**
     * Método constructor para Manager.
     * @param nombre -> Para asignar el atributo nombre.
     * @param direccion -> Para asignar el atributo direccion.
     * @param trabajo -> Para asignar el atributo trabajo (nombre del trabajo).
     * @param salario -> Para asignar el atributo salario.
     */
    public Manager(String nombre, String direccion, String trabajo, int salario){
        super(nombre, direccion, trabajo, salario);
    }
    
    /**
     * Método para calcular el bono definido.
     * @return bono -> Regresa el bono calculado.
     */
    @Override
    public double calcularBono(){
        double bono = getSalario() * 0.20;
        setSalario(getSalario()+bono);
        return bono;
    }

    /**
     * Método apra generar el reporte de desempeño de los equipos que maneja el/a manager.
     * @param desempeño -> Para definir el desempeño
     */
    @Override
    public void generarReporteDesempeño(String desempeño){
        System.out.println("Desempeño de los equipos manejados por "+ getNombre() +": "+ desempeño+"\n");
    }

    /**
     * Método para imprimir los proyectos manejados por el manager.
     */
    @Override
    public void manejoProyectos(){
        System.out.println("El/La manager " + getNombre() + " está manejando los siguientes proyectos: ");
        System.out.println("1)Desarrollo de una página web \n2)Reparación del servidor 345-G \n3)Restructuración de la bse de datos 4A");
    }
}
