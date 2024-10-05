package mx.unam.fi.poo.g1.p7;

/**
 * Clase Desarrollador extiende a Empleado
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class Desarrollador extends Empleado{

    /**
     * Método constructor para Desarrollador.
     * @param nombre -> Para asignar el atributo nombre.
     * @param direccion -> Para asignar el atributo direccion.
     * @param trabajo -> Para asignar el atributo trabajo (nombre del trabajo).
     * @param salario -> Para asignar el atributo salario.
     */
    public Desarrollador(String nombre, String direccion, String trabajo, int salario) {
        super(nombre, direccion, trabajo, salario);
    }

    /**
     * Método para calcular el bono definido.
     * @return bono -> Regresa el bono calculado.
     */
    @Override
    public double calcularBono(){
        double bono = getSalario() * 0.15;
        setSalario(getSalario()+bono);
        return bono;
    }

    /**
     * Método apra generar el reporte de desempeño del/a desarrollador/a y su equipo.
     * @param desempeño -> Para definir el desempeño
     */
    @Override
    public void generarReporteDesempeño(String desempeño){
        System.out.println("Desempeño del/a desarrollador@ "+ getNombre() +" y su equipo: "+ desempeño+"\n");
    }

    /**
     * Método para imprimir el proyecto liderado por el/a desarrollador/a.
     */
    @Override
    public void manejoProyectos(){
        System.out.println("El/La desarrollador@ " + getNombre() + " está a cargo del proyecto: ");
        System.out.println("Implementación móvil de la tienda en-línea.");
    }
    
}

